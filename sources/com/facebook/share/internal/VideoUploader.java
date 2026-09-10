package com.facebook.share.internal;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.internal.Utility;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class VideoUploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f16604a;

    /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$1, reason: invalid class name */
    final class AnonymousClass1 extends AccessTokenTracker {
        @Override // com.facebook.AccessTokenTracker
        public final void a(AccessToken accessToken, AccessToken accessToken2) {
            if (accessToken == null) {
                return;
            }
            if (accessToken2 == null || !Utility.a(accessToken2.j0, accessToken.j0)) {
                HashSet hashSet = VideoUploader.f16604a;
                synchronized (VideoUploader.class) {
                    Iterator it = VideoUploader.f16604a.iterator();
                    while (it.hasNext()) {
                        ((UploadContext) it.next()).getClass();
                    }
                }
            }
        }
    }

    public static class FinishUploadWorkItem extends UploadWorkItemBase {

        /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$FinishUploadWorkItem$1, reason: invalid class name */
        public static class AnonymousClass1 extends HashSet<Integer> {
        }

        static {
            new AnonymousClass1().add(1363011);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public final void a(int i2) {
            throw null;
        }
    }

    public static class StartUploadWorkItem extends UploadWorkItemBase {

        /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$StartUploadWorkItem$1, reason: invalid class name */
        public static class AnonymousClass1 extends HashSet<Integer> {
        }

        static {
            new AnonymousClass1().add(6000);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public final void a(int i2) {
            throw null;
        }
    }

    public static class TransferChunkWorkItem extends UploadWorkItemBase {

        /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$TransferChunkWorkItem$1, reason: invalid class name */
        public static class AnonymousClass1 extends HashSet<Integer> {
        }

        static {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            anonymousClass1.add(1363019);
            anonymousClass1.add(1363021);
            anonymousClass1.add(1363030);
            anonymousClass1.add(1363033);
            anonymousClass1.add(1363041);
        }

        @Override // com.facebook.share.internal.VideoUploader.UploadWorkItemBase
        public final void a(int i2) {
            throw null;
        }
    }

    public static class UploadContext {
    }

    public static abstract class UploadWorkItemBase implements Runnable {

        /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$UploadWorkItemBase$1, reason: invalid class name */
        class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        }

        /* JADX INFO: renamed from: com.facebook.share.internal.VideoUploader$UploadWorkItemBase$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    throw null;
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        }

        public abstract void a(int i2);

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.b(this)) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th) {
                CrashShieldHandler.a(this, th);
            }
        }
    }

    static {
        new WorkQueue(8, 0);
        f16604a = new HashSet();
    }
}
