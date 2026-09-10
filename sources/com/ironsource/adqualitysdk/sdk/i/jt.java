package com.ironsource.adqualitysdk.sdk.i;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jt {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static jt f2881;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    boolean f2883 = false;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Set<jr> f2882 = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class c extends jt {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int[] f2884 = {1279650746, 294756411, 817640471, -2125312465, -780492612, -334879192, -952517555, 633401247, -995684354, 636089764, 1453251629, -1986354820, 916684221, 1151292463, 1795236079, 1971875767, 2033329127, 2056579467};

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2885 = 0;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f2886 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Context f2887;

        public /* synthetic */ c(byte b10) {
            this();
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﻐ */
        public final boolean mo2735() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2887.getSystemService(m2741(new int[]{25760724, -1294423306, 1595395938, -866466449}, 8 - ExpandableListView.getPackedPositionGroup(0L)).intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                f2886 = (f2885 + 79) % 128;
                return false;
            }
            String packageName = this.f2887.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                f2885 = (f2886 + 77) % 128;
                if (runningAppProcessInfo.importance == 100) {
                    f2885 = (f2886 + 41) % 128;
                    if (runningAppProcessInfo.processName.equals(packageName)) {
                        f2885 = (f2886 + 15) % 128;
                        return true;
                    }
                }
            }
            f2885 = (f2886 + 15) % 128;
            return false;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﾇ */
        public final Activity mo2738() {
            int i10 = f2885 + 107;
            f2886 = i10 % 128;
            if (i10 % 2 != 0) {
                return null;
            }
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo2739(Application application, Activity activity) {
            int i10 = f2885;
            int i11 = (i10 + 7) % 128;
            f2886 = i11;
            if (application != null) {
                f2885 = (i11 + 65) % 128;
                this.f2887 = application.getApplicationContext();
                return;
            }
            if (activity != null) {
                int i12 = i10 + 17;
                f2886 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f2887 = activity.getApplicationContext();
                    throw null;
                }
                this.f2887 = activity.getApplicationContext();
            }
        }

        private c() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2741(int[] iArr, int i10) {
            String str;
            synchronized (a.f61) {
                try {
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length << 1];
                    int[] iArr2 = (int[]) f2884.clone();
                    a.f58 = 0;
                    while (true) {
                        int i11 = a.f58;
                        if (i11 < iArr.length) {
                            int i12 = iArr[i11];
                            char c4 = (char) (i12 >> 16);
                            cArr[0] = c4;
                            char c5 = (char) i12;
                            cArr[1] = c5;
                            char c10 = (char) (iArr[i11 + 1] >> 16);
                            cArr[2] = c10;
                            char c11 = (char) iArr[i11 + 1];
                            cArr[3] = c11;
                            a.f59 = (c4 << 16) + c5;
                            a.f60 = (c10 << 16) + c11;
                            a.m199(iArr2);
                            for (int i13 = 0; i13 < 16; i13++) {
                                int i14 = a.f59 ^ iArr2[i13];
                                a.f59 = i14;
                                int iM200 = a.m200(i14) ^ a.f60;
                                int i15 = a.f59;
                                a.f59 = iM200;
                                a.f60 = i15;
                            }
                            int i16 = a.f59;
                            int i17 = a.f60;
                            a.f59 = i17;
                            a.f60 = i16;
                            int i18 = i16 ^ iArr2[16];
                            a.f60 = i18;
                            int i19 = i17 ^ iArr2[17];
                            a.f59 = i19;
                            cArr[0] = (char) (i19 >>> 16);
                            cArr[1] = (char) i19;
                            cArr[2] = (char) (i18 >>> 16);
                            cArr[3] = (char) i18;
                            a.m199(iArr2);
                            int i20 = a.f58;
                            cArr2[i20 << 1] = cArr[0];
                            cArr2[(i20 << 1) + 1] = cArr[1];
                            cArr2[(i20 << 1) + 2] = cArr[2];
                            cArr2[(i20 << 1) + 3] = cArr[3];
                            a.f58 = i20 + 2;
                        } else {
                            str = new String(cArr2, 0, i10);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jt m2734() {
        try {
            if (f2881 == null) {
                f2881 = new d((byte) 0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2881;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public abstract boolean mo2735();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized List<jr> m2737() {
        return new ArrayList(this.f2882);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public abstract Activity mo2738();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract void mo2739(Application application, Activity activity);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2740(jr jrVar) {
        this.f2882.remove(jrVar);
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @TargetApi(14)
    public static class d extends jt implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2888 = 22;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2889 = 1;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2890 = 0;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static boolean f2891 = true;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static boolean f2892 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char[] f2893 = {']', 130, 133, 'x', 'w', 'b', 127, '|', '{', 'y', 143, 137, 138, 132, 136, 'i', 140, '[', '6', 'W', 'h', 139, 131, 'z', 'f', 'Y', 'D', 'I', 134, 'k', 142, '_', 'Z'};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2894;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private WeakReference<Activity> f2895;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private WeakReference<Application> f2896;

        private d() {
            this.f2894 = new WeakHashMap();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m2742(final Activity activity) {
            this.f2895 = new WeakReference<>(activity);
            p.m2996(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jt.d.4
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() throws Exception {
                    kf.m2814(activity);
                }
            });
            f2890 = (f2889 + 83) % 128;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private void m2743(Activity activity) {
            f2889 = (f2890 + 95) % 128;
            Iterator<jr> it = m2737().iterator();
            f2889 = (f2890 + 91) % 128;
            while (it.hasNext()) {
                it.next().mo397(activity);
            }
            f2889 = (f2890 + 123) % 128;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private void m2744(Activity activity) {
            Iterator<jr> it = m2737().iterator();
            f2890 = (f2889 + 61) % 128;
            while (it.hasNext()) {
                f2889 = (f2890 + 107) % 128;
                it.next().mo396(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (jt.class) {
                    try {
                        if (this.f2895 == null) {
                            m2742(activity);
                            jt.class.notifyAll();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e10) {
                kl.m2899(m2745(null, 127 - View.MeasureSpec.getSize(0), null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0098\u0089\u008d\u0085\u0089\u008f\u009a\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            int i10 = f2889 + InterfaceC0435l1.d.b.f29114k;
            f2890 = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    m2737().iterator();
                    throw null;
                }
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    f2890 = (f2889 + InterfaceC0435l1.d.b.f29107d) % 128;
                    it.next().onActivityDestroyed(activity);
                }
            } catch (Exception e10) {
                kl.m2899(m2745(null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + WebSocketProtocol.PAYLOAD_SHORT, null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0098\u0089\u008b\u0083\u008f\u008d\u008c\u0089¡\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Iterator<jr> it;
            int i10 = f2890 + 11;
            f2889 = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    it = m2737().iterator();
                    int i11 = 4 / 0;
                } else {
                    it = m2737().iterator();
                }
                f2890 = (f2889 + 1) % 128;
                while (it.hasNext()) {
                    int i12 = f2890 + 7;
                    f2889 = i12 % 128;
                    if (i12 % 2 == 0) {
                        it.next().onActivityPaused(activity);
                        int i13 = 32 / 0;
                    } else {
                        it.next().onActivityPaused(activity);
                    }
                }
                f2890 = (f2889 + 51) % 128;
            } catch (Exception e10) {
                kl.m2899(m2745(null, 127 - Color.alpha(0), null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, Color.green(0) + 127, null, "\u0098\u0089\u008c\u0096\u0085\u0099\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                m2742(activity);
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    int i10 = f2889 + 3;
                    f2890 = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                    f2889 = (f2890 + 59) % 128;
                }
            } catch (Exception e10) {
                kl.m2899(m2745(null, 127 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, 127 - (ViewConfiguration.getScrollDefaultDelay() >> 16), null, "\u0098\u0089\u0097\u0096\u008c\u0089\u0095\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f2890 = (f2889 + 41) % 128;
            try {
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    int i10 = f2889 + 19;
                    f2890 = i10 % 128;
                    if (i10 % 2 != 0) {
                        it.next().onActivitySaveInstanceState(activity, bundle);
                        int i11 = 63 / 0;
                    } else {
                        it.next().onActivitySaveInstanceState(activity, bundle);
                    }
                }
            } catch (Exception e10) {
                kl.m2899(m2745(null, 126 - Process.getGidForName(""), null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, 127 - KeyEvent.normalizeMetaState(0), null, "\u0089\u008d\u0085\u008d\u0090\u0089\u008a\u008e\u0085\u008d\u008c\u008e \u0089\u0091\u0085\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2895 == null) {
                    m2742(activity);
                }
                synchronized (this) {
                    this.f2894.put(activity, Boolean.TRUE);
                }
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m2745(null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), null, "\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008b\u009f\u0083\u008f\u0099\u008f\u0089\u008b\u0085\u0082\u0099\u008b\u008d\u0087\u008e\u009e\u009b\u008f\u0089\u008b\u0085\u0082\u009d\u009b\u0098\u009c\u008b\u008d\u0087\u008e\u0096\u009b\u0097\u0083\u008a").intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2894.size() == 1 && !this.f2883) {
                            m2743(activity);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                kl.m2899(m2745(null, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, 126 - Process.getGidForName(""), null, "\u0098\u0089\u008d\u008f\u0085\u008d\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jr> it = m2737().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2883 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f2894.containsKey(activity) || activity.getLocalClassName().equals(m2745(null, 127 - (Process.myPid() >> 22), null, "\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008b\u009f\u0083\u008f\u0099\u008f\u0089\u008b\u0085\u0082\u0099\u008b\u008d\u0087\u008e\u009e\u009b\u008f\u0089\u008b\u0085\u0082\u009d\u009b\u0098\u009c\u008b\u008d\u0087\u008e\u0096\u009b\u0097\u0083\u008a").intern())) {
                            size = -1;
                        } else {
                            this.f2894.remove(activity);
                            size = this.f2894.size();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (size < 0 || size != 0 || this.f2883) {
                    return;
                }
                m2744(activity);
            } catch (Exception e10) {
                kl.m2899(m2745(null, Process.getGidForName("") + 128, null, "\u0089\u008a\u0087\u0091\u008f\u0089\u0090\u008f\u0089\u008e\u0089\u008d\u008c\u0087\u0086\u0089\u0082\u008a\u008b\u008a\u0089\u0088\u0087\u0086\u0082\u0085\u0084\u0083\u0082\u0081").intern(), m2745(null, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, null, "\u0098\u0089\u009d\u009d\u0083\u008d\u0090\u008b\u008d\u0087\u0091\u0087\u008d\u008a\u0094\u008e\u0083\u0093\u008e\u0087\u0093\u008f\u0083\u008f\u008f\u0092").intern(), e10, false);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            return r3.f2895.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.jt.d.f2889 = (r1 + 83) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        
            if (r3.f2895 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            if (r3.f2895 != null) goto L9;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﾇ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.app.Activity mo2738() {
            /*
                r3 = this;
                int r0 = com.ironsource.adqualitysdk.sdk.i.jt.d.f2889
                int r0 = r0 + 75
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jt.d.f2890 = r1
                int r0 = r0 % 2
                if (r0 == 0) goto L15
                java.lang.ref.WeakReference<android.app.Activity> r0 = r3.f2895
                r2 = 37
                int r2 = r2 / 0
                if (r0 == 0) goto L22
                goto L19
            L15:
                java.lang.ref.WeakReference<android.app.Activity> r0 = r3.f2895
                if (r0 == 0) goto L22
            L19:
                java.lang.ref.WeakReference<android.app.Activity> r3 = r3.f2895
                java.lang.Object r3 = r3.get()
                android.app.Activity r3 = (android.app.Activity) r3
                return r3
            L22:
                int r1 = r1 + 83
                int r1 = r1 % 128
                com.ironsource.adqualitysdk.sdk.i.jt.d.f2889 = r1
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jt.d.mo2738():android.app.Activity");
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﾒ */
        public final synchronized void mo2739(Application application, Activity activity) {
            try {
                if (this.f2896 == null) {
                    this.f2896 = new WeakReference<>(application);
                    if (activity != null) {
                        m2742(activity);
                        synchronized (this) {
                            this.f2894.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public /* synthetic */ d(byte b10) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        
            if (r3.f2894.size() > 0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
        
            com.ironsource.adqualitysdk.sdk.i.jt.d.f2890 = (com.ironsource.adqualitysdk.sdk.i.jt.d.f2889 + 35) % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        
            return true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
        
            return false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        
            if (r3.f2894.size() > 0) goto L16;
         */
        @Override // com.ironsource.adqualitysdk.sdk.i.jt
        /* JADX INFO: renamed from: ﻐ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized boolean mo2735() {
            /*
                r3 = this;
                monitor-enter(r3)
                int r0 = com.ironsource.adqualitysdk.sdk.i.jt.d.f2889     // Catch: java.lang.Throwable -> L1c
                int r0 = r0 + 63
                int r1 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jt.d.f2890 = r1     // Catch: java.lang.Throwable -> L1c
                int r0 = r0 % 2
                r1 = 0
                if (r0 == 0) goto L1e
                java.util.Map<android.app.Activity, java.lang.Boolean> r0 = r3.f2894     // Catch: java.lang.Throwable -> L1c
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
                r2 = 62
                int r2 = r2 / r1
                if (r0 <= 0) goto L31
                goto L26
            L1a:
                r0 = move-exception
                throw r0     // Catch: java.lang.Throwable -> L1c
            L1c:
                r0 = move-exception
                goto L33
            L1e:
                java.util.Map<android.app.Activity, java.lang.Boolean> r0 = r3.f2894     // Catch: java.lang.Throwable -> L1c
                int r0 = r0.size()     // Catch: java.lang.Throwable -> L1c
                if (r0 <= 0) goto L31
            L26:
                int r0 = com.ironsource.adqualitysdk.sdk.i.jt.d.f2889     // Catch: java.lang.Throwable -> L1c
                int r0 = r0 + 35
                int r0 = r0 % 128
                com.ironsource.adqualitysdk.sdk.i.jt.d.f2890 = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r3)
                r3 = 1
                return r3
            L31:
                monitor-exit(r3)
                return r1
            L33:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L1c
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.jt.d.mo2735():boolean");
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2745(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
            Object bytes = str2;
            if (str2 != null) {
                bytes = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) bytes;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (k.f2932) {
                try {
                    char[] cArr2 = f2893;
                    int i11 = f2888;
                    if (f2891) {
                        int length = bArr.length;
                        k.f2931 = length;
                        char[] cArr3 = new char[length];
                        k.f2933 = 0;
                        while (k.f2933 < k.f2931) {
                            int i12 = k.f2933;
                            int i13 = k.f2931 - 1;
                            int i14 = k.f2933;
                            cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                            k.f2933 = i14 + 1;
                        }
                        return new String(cArr3);
                    }
                    if (f2892) {
                        int length2 = cArr.length;
                        k.f2931 = length2;
                        char[] cArr4 = new char[length2];
                        k.f2933 = 0;
                        while (k.f2933 < k.f2931) {
                            int i15 = k.f2933;
                            int i16 = k.f2931 - 1;
                            int i17 = k.f2933;
                            cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                            k.f2933 = i17 + 1;
                        }
                        return new String(cArr4);
                    }
                    int length3 = iArr.length;
                    k.f2931 = length3;
                    char[] cArr5 = new char[length3];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i18 = k.f2933;
                        int i19 = k.f2931 - 1;
                        int i20 = k.f2933;
                        cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                        k.f2933 = i20 + 1;
                    }
                    return new String(cArr5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2736(jr jrVar) {
        this.f2882.add(jrVar);
    }
}
