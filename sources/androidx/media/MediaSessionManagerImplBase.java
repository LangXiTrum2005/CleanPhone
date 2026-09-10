package androidx.media;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
class MediaSessionManagerImplBase implements MediaSessionManager.MediaSessionManagerImpl {

    public static class RemoteUserInfoImplBase implements MediaSessionManager.RemoteUserInfoImpl {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5361c;

        public RemoteUserInfoImplBase(String str, int i2, int i3) {
            this.f5359a = str;
            this.f5360b = i2;
            this.f5361c = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteUserInfoImplBase)) {
                return false;
            }
            RemoteUserInfoImplBase remoteUserInfoImplBase = (RemoteUserInfoImplBase) obj;
            int i2 = this.f5361c;
            String str = this.f5359a;
            int i3 = this.f5360b;
            if (i3 < 0 || remoteUserInfoImplBase.f5360b < 0) {
                return TextUtils.equals(str, remoteUserInfoImplBase.f5359a) && i2 == remoteUserInfoImplBase.f5361c;
            }
            return TextUtils.equals(str, remoteUserInfoImplBase.f5359a) && i3 == remoteUserInfoImplBase.f5360b && i2 == remoteUserInfoImplBase.f5361c;
        }

        public final int hashCode() {
            return Objects.hash(this.f5359a, Integer.valueOf(this.f5361c));
        }
    }

    static {
        int i2 = MediaSessionManager.f5357a;
    }
}
