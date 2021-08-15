package com.sewerganger.pure_manager;

import com.sewerganger.pure_manager.tools.archive.ArchivePlugin;
import com.sewerganger.pure_manager.tools.connectivity.ConnectivityPlugin;
import com.sewerganger.pure_manager.tools.fs.FsPlugin;
import com.sewerganger.pure_manager.tools.fs.StorageListenerPlugin;
import com.sewerganger.pure_manager.tools.glide.GlidePlugin;
import com.sewerganger.pure_manager.tools.pkg.PackageManagerPlugin;

import io.flutter.embedding.engine.FlutterEngine;

public final class InnerPluginMgmt {
    public static void register(FlutterEngine flutterEngine) {
        flutterEngine.getPlugins().add(new ConnectivityPlugin());
        flutterEngine.getPlugins().add(new GlidePlugin());
        flutterEngine.getPlugins().add(new ArchivePlugin());
        flutterEngine.getPlugins().add(new PackageManagerPlugin());
        // 基本文件系统操作插件
        flutterEngine.getPlugins().add(new FsPlugin());
        // 存储设备监听插件
        flutterEngine.getPlugins().add(new StorageListenerPlugin());
    }
}
