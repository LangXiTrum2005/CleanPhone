package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ji {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static ji f2694;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    boolean f2696 = false;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Set<jh> f2695 = new HashSet();

    public static class e extends ji {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f2704 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static int f2705 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f2706 = 52991;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static char f2707 = 18793;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static char f2708 = 49886;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2709 = 60324;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Context f2710;

        public /* synthetic */ e(byte b2) {
            this();
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﻛ */
        public final boolean mo2598() {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f2710.getSystemService(m2605("쇎\uf538잁✝㘹\u1a8b갞鋬", (ViewConfiguration.getTapTimeout() >> 16) + 8).intern())).getRunningAppProcesses();
            if (runningAppProcesses == null) {
                int i2 = f2704 + 23;
                f2705 = i2 % 128;
                return i2 % 2 == 0;
            }
            String packageName = this.f2710.getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                f2705 = (f2704 + 41) % 128;
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                    return true;
                }
                f2705 = (f2704 + 49) % 128;
            }
            return false;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ｋ */
        public final synchronized void mo2599(Application application, Activity activity) {
            int i2 = f2705;
            f2704 = (i2 + 45) % 128;
            if (application == null) {
                if (activity != null) {
                    this.f2710 = activity.getApplicationContext();
                }
                f2705 = (f2704 + 63) % 128;
            } else {
                int i3 = i2 + 59;
                f2704 = i3 % 128;
                if (i3 % 2 == 0) {
                    this.f2710 = application.getApplicationContext();
                } else {
                    this.f2710 = application.getApplicationContext();
                    throw null;
                }
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﾒ */
        public final Activity mo2600() {
            int i2 = f2704;
            int i3 = i2 + 9;
            f2705 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 88 / 0;
            }
            f2705 = (i2 + 123) % 128;
            return null;
        }

        private e() {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2605(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (m.f2870) {
                try {
                    char[] cArr2 = new char[cArr.length];
                    m.f2869 = 0;
                    char[] cArr3 = new char[2];
                    while (true) {
                        int i3 = m.f2869;
                        if (i3 < cArr.length) {
                            cArr3[0] = cArr[i3];
                            cArr3[1] = cArr[i3 + 1];
                            int i4 = 58224;
                            for (int i5 = 0; i5 < 16; i5++) {
                                char c2 = cArr3[1];
                                char c3 = cArr3[0];
                                char c4 = (char) (c2 - (((c3 + i4) ^ ((c3 << 4) + f2707)) ^ ((c3 >>> 5) + f2706)));
                                cArr3[1] = c4;
                                cArr3[0] = (char) (c3 - (((c4 >>> 5) + f2709) ^ ((c4 + i4) ^ ((c4 << 4) + f2708))));
                                i4 -= 40503;
                            }
                            int i6 = m.f2869;
                            cArr2[i6] = cArr3[0];
                            cArr2[i6 + 1] = cArr3[1];
                            m.f2869 = i6 + 2;
                        } else {
                            str2 = new String(cArr2, 0, i2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static synchronized ji m2594() {
        try {
            if (f2694 == null) {
                f2694 = new d((byte) 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2694;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2596(jh jhVar) {
        this.f2695.remove(jhVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m2597(jh jhVar) {
        this.f2695.add(jhVar);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract boolean mo2598();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public abstract void mo2599(Application application, Activity activity);

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public abstract Activity mo2600();

    public static class d extends ji implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2697 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2698 = 1;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f2699 = -94023936668216804L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private WeakReference<Activity> f2700;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private WeakReference<Application> f2701;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Map<Activity, Boolean> f2702;

        private d() {
            this.f2702 = new WeakHashMap();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private void m2602(Activity activity) {
            f2698 = (f2697 + 119) % 128;
            Iterator<jh> it = m2595().iterator();
            while (it.hasNext()) {
                int i2 = f2698 + 73;
                f2697 = i2 % 128;
                if (i2 % 2 != 0) {
                    it.next().mo394(activity);
                    throw null;
                }
                it.next().mo394(activity);
            }
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m2604(final Activity activity) {
            this.f2700 = new WeakReference<>(activity);
            s.m2926(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.ji.d.3
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() throws Exception {
                    jy.m2700(activity);
                }
            });
            f2698 = (f2697 + 49) % 128;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            try {
                synchronized (ji.class) {
                    try {
                        if (this.f2700 == null) {
                            m2604(activity);
                            ji.class.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    it.next().onActivityCreated(activity, bundle);
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getTapTimeout() >> 16).intern(), m2601("튨튷틭Ù猗흝ၽ晆骪젛㮜껗䉨뀤\ue22bᜈ\u0b9b禯ꪼ徯\uf301℟ዜ蠪룪\uee9e\ud954\uf08d恭噯", (-1) - ImageFormat.getBitsPerPixel(0)).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            f2697 = (f2698 + 55) % 128;
            try {
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    int i2 = f2697 + 95;
                    f2698 = i2 % 128;
                    if (i2 % 2 == 0) {
                        it.next().onActivityDestroyed(activity);
                        throw null;
                    }
                    it.next().onActivityDestroyed(activity);
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2601("숴ꁘ쉱父㜻鍱\ue343镸訶뫴羰巩勴싋ꘇ\ue436ᬇୀ\uee90겑\ue39d台困笓ꡡ鱧鵭ε烻⒝엌쯓", TextUtils.indexOf((CharSequence) "", '0') + 1).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            f2697 = (f2698 + 101) % 128;
            try {
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    int i2 = f2697 + 15;
                    f2698 = i2 % 128;
                    if (i2 % 2 == 0) {
                        it.next().onActivityPaused(activity);
                        int i3 = 4 / 0;
                    } else {
                        it.next().onActivityPaused(activity);
                    }
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), m2601("븞\udc72빛ผ完ￆ\udb63굘\uf61c웞ጇ旉⻞뻡쪰\udc16札睪舧钱龷\u2fda㩇䌧푏\ue04b\uf1dd㮂\u0cda", View.combineMeasuredStates(0, 0)).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            int i2 = f2698 + 121;
            f2697 = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    m2604(activity);
                    m2595().iterator();
                    throw null;
                }
                m2604(activity);
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    int i3 = f2698 + 103;
                    f2697 = i3 % 128;
                    if (i3 % 2 != 0) {
                        it.next().onActivityResumed(activity);
                        throw null;
                    }
                    it.next().onActivityResumed(activity);
                }
                int i4 = f2698 + 113;
                f2697 = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ExpandableListView.getPackedPositionGroup(0L)).intern(), m2601("婬⨴娩\uf85a᰿롵ῡ槚ቮ\u3098咴ꅋ쪬䢧贃ᢔ荟脬얔倳篅\ud99c練螧〹ᘋ뙨（\ue8a9껬", Color.alpha(0)).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            f2698 = (f2697 + 15) % 128;
            try {
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    f2698 = (f2697 + 77) % 128;
                    it.next().onActivitySaveInstanceState(activity, bundle);
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), m2601("跙䢄趜髪镝ㄗØ監엛刨\uddd6빲ᴙ⨗ѡޭ哪\ue39c䳶伊거묬\uf496颟\ue788璾㼚\ue015㼗챋枻⡍皧藋긺燯츭嵹훛륩", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                if (this.f2700 == null) {
                    m2604(activity);
                }
                synchronized (this) {
                    this.f2702.put(activity, Boolean.TRUE);
                }
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStarted(activity);
                }
                if (activity.getLocalClassName().equals(m2601("䯏ಓ䮬\udee0氷졢\ue134靎ϊᙱ⒣径\udb56湜ﴞ\ue62e鋯ꞓ떋껩橪］ප祵↑ザ왾ǉ錄衃黛즹낺쇍坺逢ࠠ\u1977⾣墡쁜勫\uf823\ue306鿆ꪛ낃", TextUtils.indexOf("", "")).intern())) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2702.size() == 1 && !this.f2696) {
                            m2602(activity);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", ViewConfiguration.getKeyRepeatTimeout() >> 16).intern(), m2601("煂宀焇觮\uf127啭㢛亠㥀䄬리蘱\ue182㤓怛㿮ꡱ\uf098⢌睉僫꠨郬ꃜᬆ枭孷\ud86b쎇\udf58", ViewConfiguration.getMaximumFlingVelocity() >> 16).intern(), (Throwable) e2, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            int size;
            try {
                Iterator<jh> it = m2595().iterator();
                while (it.hasNext()) {
                    it.next().onActivityStopped(activity);
                }
                this.f2696 = activity.isChangingConfigurations();
                synchronized (this) {
                    try {
                        if (!this.f2702.containsKey(activity) || activity.getLocalClassName().equals(m2601("䯏ಓ䮬\udee0氷졢\ue134靎ϊᙱ⒣径\udb56湜ﴞ\ue62e鋯ꞓ떋껩橪］ප祵↑ザ왾ǉ錄衃黛즹낺쇍坺逢ࠠ\u1977⾣墡쁜勫\uf823\ue306鿆ꪛ낃", KeyEvent.getMaxKeyCode() >> 16).intern())) {
                            size = -1;
                        } else {
                            this.f2702.remove(activity);
                            size = this.f2702.size();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (size < 0 || size != 0 || this.f2696) {
                    return;
                }
                m2603(activity);
            } catch (Exception e2) {
                kb.m2752(m2601("뻇豽뺀帍冭\uf5fa⚨傞\uf6d6隝ᤞ項⹁\ueee4삁⇥柴❽蠗楀齮習ぶ뻙풙끔ﯠ왿ంࢳꍔี䖴䄴", TextUtils.indexOf("", "")).intern(), m2601("똾ꃀ뙻犮\ued04䥎瓽ˆ︼멬ꖏ쩗⛾쉓簸玈漍\u0bd8㒯㬯鞗卨賏\uecba\udc7a鳣䝖鐉ӻ␘", Color.green(0)).intern(), (Throwable) e2, false);
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﻛ */
        public final synchronized boolean mo2598() {
            f2698 = (f2697 + 71) % 128;
            if (this.f2702.size() <= 0) {
                return false;
            }
            int i2 = f2697 + 1;
            f2698 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ｋ */
        public final synchronized void mo2599(Application application, Activity activity) {
            try {
                if (this.f2701 == null) {
                    this.f2701 = new WeakReference<>(application);
                    if (activity != null) {
                        m2604(activity);
                        synchronized (this) {
                            this.f2702.put(activity, Boolean.TRUE);
                        }
                    }
                    application.registerActivityLifecycleCallbacks(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.ji
        /* JADX INFO: renamed from: ﾒ */
        public final Activity mo2600() {
            int i2 = f2698;
            f2697 = (i2 + 99) % 128;
            WeakReference<Activity> weakReference = this.f2700;
            if (weakReference != null) {
                return weakReference.get();
            }
            f2697 = (i2 + 63) % 128;
            return null;
        }

        public /* synthetic */ d(byte b2) {
            this();
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static String m2601(String str, int i2) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (f.f1955) {
                try {
                    char[] cArrM2116 = f.m2116(f2699, cArr, i2);
                    f.f1954 = 4;
                    while (true) {
                        int i3 = f.f1954;
                        if (i3 < cArrM2116.length) {
                            int i4 = i3 - 4;
                            f.f1953 = i4;
                            cArrM2116[i3] = (char) (((long) (cArrM2116[i3] ^ cArrM2116[i3 % 4])) ^ (((long) i4) * f2699));
                            f.f1954 = i3 + 1;
                        } else {
                            str2 = new String(cArrM2116, 4, cArrM2116.length - 4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private void m2603(Activity activity) {
            Iterator<jh> it = m2595().iterator();
            f2698 = (f2697 + 51) % 128;
            while (it.hasNext()) {
                f2697 = (f2698 + 105) % 128;
                it.next().mo395(activity);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized List<jh> m2595() {
        return new ArrayList(this.f2695);
    }
}
