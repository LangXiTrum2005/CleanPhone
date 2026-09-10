package com.hjq.permissions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class AndroidManifestInfo {
    ApplicationInfo applicationInfo;
    String packageName;

    @Nullable
    UsesSdkInfo usesSdkInfo;

    @NonNull
    final List<PermissionInfo> permissionInfoList = new ArrayList();

    @NonNull
    final List<ActivityInfo> activityInfoList = new ArrayList();

    @NonNull
    final List<ServiceInfo> serviceInfoList = new ArrayList();

    public static final class ActivityInfo {
        public String name;
        public boolean supportsPictureInPicture;
    }

    public static final class ApplicationInfo {
        public String name;
        public boolean requestLegacyExternalStorage;
    }

    public static final class PermissionInfo {
        private static final int REQUESTED_PERMISSION_NEVER_FOR_LOCATION = 65536;
        public int maxSdkVersion;
        public String name;
        public int usesPermissionFlags;

        public boolean neverForLocation() {
            return (this.usesPermissionFlags & 65536) != 0;
        }
    }

    public static final class ServiceInfo {
        public String name;
        public String permission;
    }

    public static final class UsesSdkInfo {
        public int minSdkVersion;
    }
}
