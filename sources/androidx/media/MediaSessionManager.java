package androidx.media;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.emoji2.text.b;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5357a = 0;

    public interface MediaSessionManagerImpl {
    }

    public interface RemoteUserInfoImpl {
    }

    static {
        Log.isLoggable("MediaSessionManager", 3);
    }

    public static final class RemoteUserInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSessionManagerImplBase.RemoteUserInfoImplBase f5358a;

        public RemoteUserInfo(String str, int i2, int i3) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT < 28) {
                this.f5358a = new MediaSessionManagerImplBase.RemoteUserInfoImplBase(str, i2, i3);
                return;
            }
            MediaSessionManagerImplApi28.RemoteUserInfoImplApi28 remoteUserInfoImplApi28 = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(str, i2, i3);
            b.n(i2, i3, str);
            this.f5358a = remoteUserInfoImplApi28;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfo)) {
                return false;
            }
            return this.f5358a.equals(((RemoteUserInfo) obj).f5358a);
        }

        public final int hashCode() {
            return this.f5358a.hashCode();
        }

        public RemoteUserInfo(android.media.session.MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName = remoteUserInfo.getPackageName();
            if (packageName != null) {
                if (!TextUtils.isEmpty(packageName)) {
                    this.f5358a = new MediaSessionManagerImplApi28.RemoteUserInfoImplApi28(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
