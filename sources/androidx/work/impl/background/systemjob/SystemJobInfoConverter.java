package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.Logger;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes.dex */
class SystemJobInfoConverter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f8716b = Logger.e("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f8717a;

    /* JADX INFO: renamed from: androidx.work.impl.background.systemjob.SystemJobInfoConverter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8718a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f8718a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8718a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8718a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8718a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8718a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SystemJobInfoConverter(Context context) {
        this.f8717a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
