package com.example.buy.config;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.LruBitmapPool;
import com.bumptech.glide.load.engine.cache.ExternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory;
import com.bumptech.glide.load.engine.cache.LruResourceCache;
import com.bumptech.glide.load.engine.cache.MemorySizeCalculator;
import com.bumptech.glide.module.GlideModule;

public class glideModelConfig implements GlideModule {
    int disksize=1024*1024*10;
    int memorysize=(int)(Runtime.getRuntime().maxMemory())/8;
    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        builder.setDiskCache(new InternalCacheDiskCacheFactory(context, disksize)); //内存
        builder.setDiskCache(new ExternalCacheDiskCacheFactory(context, "cache", disksize)); //sd卡中
        builder.setDecodeFormat(DecodeFormat.PREFER_ARGB_8888);
        builder.setMemoryCache(new LruResourceCache(memorysize)); // 该两句无需设置，是默认的
        builder.setBitmapPool(new LruBitmapPool(memorysize));// 自定义内存和图片池大小
    }

    @Override
    public void registerComponents(Context context, Glide glide) {

    }
}
