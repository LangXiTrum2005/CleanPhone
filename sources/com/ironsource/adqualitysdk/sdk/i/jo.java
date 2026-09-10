package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class jo {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jo f2819;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private js f2820;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2822;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2823;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private HashMap<iw, je> f2824 = new HashMap<>();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Handler f2821 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass1 extends je {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        final /* synthetic */ iw f2826;

        public AnonymousClass1(iw iwVar) {
            this.f2826 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            jo.this.f2824.put(this.f2826, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.1.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* JADX INFO: renamed from: ｋ */
                public final void mo254() {
                    AnonymousClass1.this.f2826.mo1852();
                }
            });
            jo.m2697(jo.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jo$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass2 extends je {

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ iw f2829;

        public AnonymousClass2(iw iwVar) {
            this.f2829 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            jo.this.f2824.remove(this.f2829);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jo$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class AnonymousClass4 extends je {
        public AnonymousClass4() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* JADX INFO: renamed from: ｋ */
        public final void mo254() {
            if (jo.this.f2820 == null) {
                jo.this.f2820 = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* JADX INFO: renamed from: ﾇ */
                    public final void mo396(Activity activity) {
                        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                final jo joVar = jo.this;
                                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        jo.m2689(jo.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo397(Activity activity) {
                        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                jo.m2697(jo.this);
                            }
                        });
                    }
                };
                jo.this.f2821.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        jt.m2734().m2736(jo.this.f2820);
                        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* JADX INFO: renamed from: ｋ */
                            public final void mo254() {
                                jo.m2697(jo.this);
                            }
                        });
                    }
                });
            }
        }
    }

    private jo() {
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m2687(jo joVar) {
        return new HashMap(joVar.f2824);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2689(jo joVar) {
        joVar.f2822 = false;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static synchronized jo m2696() {
        try {
            if (f2819 == null) {
                f2819 = new jo();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2819;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m2698() {
        p.m3001(new AnonymousClass4());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2700(iw iwVar) {
        p.m3001(new AnonymousClass1(iwVar));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2699(iw iwVar) {
        p.m3001(new AnonymousClass2(iwVar));
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2697(jo joVar) {
        if (joVar.f2822 || new HashMap(joVar.f2824).isEmpty()) {
            return;
        }
        joVar.f2822 = true;
        p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* JADX INFO: renamed from: ｋ */
            public final void mo254() {
                if (!jo.this.f2822) {
                    jo.this.f2823 = null;
                    return;
                }
                HashMap mapM2687 = jo.m2687(jo.this);
                Iterator it = mapM2687.keySet().iterator();
                while (it.hasNext()) {
                    jo.this.f2821.post((Runnable) mapM2687.get((iw) it.next()));
                }
                if (jo.this.f2823 == null) {
                    jo.this.f2823 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3.2

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static char f2831 = 5;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static char[] f2832 = {'A', 'd', 'Q', 'u', 'a', 'l', 'i', 't', 'y', 'S', 'D', 'K', 'f', 'e', ' ', 'o', 'F', 'r', 'n', 'B', 'C', 'E', 'G', 'H', 'I'};

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2833 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2834 = 1;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m2701(int i10, String str, byte b10) {
                            String str2;
                            Object charArray = str;
                            if (str != null) {
                                charArray = str.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (j.f2647) {
                                try {
                                    char[] cArr2 = f2832;
                                    char c4 = f2831;
                                    char[] cArr3 = new char[i10];
                                    if (i10 % 2 != 0) {
                                        i10--;
                                        cArr3[i10] = (char) (cArr[i10] - b10);
                                    }
                                    if (i10 > 1) {
                                        j.f2654 = 0;
                                        while (true) {
                                            int i11 = j.f2654;
                                            if (i11 >= i10) {
                                                break;
                                            }
                                            j.f2653 = cArr[i11];
                                            j.f2650 = cArr[j.f2654 + 1];
                                            if (j.f2653 == j.f2650) {
                                                cArr3[j.f2654] = (char) (j.f2653 - b10);
                                                cArr3[j.f2654 + 1] = (char) (j.f2650 - b10);
                                            } else {
                                                j.f2652 = j.f2653 / c4;
                                                j.f2649 = j.f2653 % c4;
                                                j.f2651 = j.f2650 / c4;
                                                j.f2648 = j.f2650 % c4;
                                                if (j.f2649 == j.f2648) {
                                                    j.f2652 = f2.A(j.f2652, c4, 1, c4);
                                                    j.f2651 = f2.A(j.f2651, c4, 1, c4);
                                                    int i12 = (j.f2652 * c4) + j.f2649;
                                                    int i13 = (j.f2651 * c4) + j.f2648;
                                                    int i14 = j.f2654;
                                                    cArr3[i14] = cArr2[i12];
                                                    cArr3[i14 + 1] = cArr2[i13];
                                                } else if (j.f2652 == j.f2651) {
                                                    j.f2649 = f2.A(j.f2649, c4, 1, c4);
                                                    j.f2648 = f2.A(j.f2648, c4, 1, c4);
                                                    int i15 = (j.f2652 * c4) + j.f2649;
                                                    int i16 = (j.f2651 * c4) + j.f2648;
                                                    int i17 = j.f2654;
                                                    cArr3[i17] = cArr2[i15];
                                                    cArr3[i17 + 1] = cArr2[i16];
                                                } else {
                                                    int i18 = (j.f2652 * c4) + j.f2648;
                                                    int i19 = (j.f2651 * c4) + j.f2649;
                                                    int i20 = j.f2654;
                                                    cArr3[i20] = cArr2[i18];
                                                    cArr3[i20 + 1] = cArr2[i19];
                                                }
                                            }
                                            j.f2654 += 2;
                                        }
                                    }
                                    str2 = new String(cArr3);
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return str2;
                        }

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j10) {
                            f2833 = (f2834 + 75) % 128;
                            try {
                                p.m2996(this);
                                int i10 = f2833 + 43;
                                f2834 = i10 % 128;
                                if (i10 % 2 == 0) {
                                    throw null;
                                }
                            } catch (Throwable th2) {
                                m.m2971(m2701(12 - ExpandableListView.getPackedPositionType(0L), "\u0001\u0002\u0003\u0004\u0000\t\u0007\b\t\u0005\u000b\f", (byte) (48 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern(), m2701(((Process.getThreadPriority(0) + 20) >> 6) + 14, "\u000e\u0002\u0007\u0006\u000b\u0003\u000b\u0004\u0010\u0011\u0013\u0002\u0017\u0012", (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 15)).intern(), th2, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jo.this.f2823);
            }
        });
    }
}
