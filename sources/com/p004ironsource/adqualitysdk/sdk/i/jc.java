package com.p004ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class jc {

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static jc f2617;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private jf f2618;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f2619;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2622;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private HashMap<il, it> f2621 = new HashMap<>();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f2620 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jc$3, reason: invalid class name */
    public class AnonymousClass3 extends it {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ il f2630;

        public AnonymousClass3(il ilVar) {
            this.f2630 = ilVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            jc.this.f2621.remove(this.f2630);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jc$4, reason: invalid class name */
    public class AnonymousClass4 extends it {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ il f2631;

        public AnonymousClass4(il ilVar) {
            this.f2631 = ilVar;
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            jc.this.f2621.put(this.f2631, new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.4.4
                @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    AnonymousClass4.this.f2631.mo1780();
                }
            });
            jc.m2545(jc.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jc$5, reason: invalid class name */
    public class AnonymousClass5 extends it {
        public AnonymousClass5() {
        }

        @Override // com.p004ironsource.adqualitysdk.sdk.i.it
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            if (jc.this.f2618 == null) {
                jc.this.f2618 = new jf() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
                    /* JADX INFO: renamed from: ﻛ */
                    public final void mo394(Activity activity) {
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4.4
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                jc.m2545(jc.this);
                            }
                        });
                    }

                    @Override // com.p004ironsource.adqualitysdk.sdk.i.jf, com.p004ironsource.adqualitysdk.sdk.i.jh
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo395(Activity activity) {
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.4.3
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                final jc jcVar = jc.this;
                                s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.2
                                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        jc.m2536(jc.this);
                                    }
                                });
                            }
                        });
                    }
                };
                jc.this.f2620.post(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.5
                    @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        ji.m2594().m2597(jc.this.f2618);
                        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.5.5.4
                            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                jc.m2545(jc.this);
                            }
                        });
                    }
                });
            }
        }
    }

    private jc() {
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2536(jc jcVar) {
        jcVar.f2619 = false;
        return false;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ HashMap m2537(jc jcVar) {
        return new HashMap(jcVar.f2621);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m2545(jc jcVar) {
        if (jcVar.f2619 || new HashMap(jcVar.f2621).isEmpty()) {
            return;
        }
        jcVar.f2619 = true;
        s.m2917(new it() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.1
            @Override // com.p004ironsource.adqualitysdk.sdk.i.it
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (!jc.this.f2619) {
                    jc.this.f2622 = null;
                    return;
                }
                HashMap mapM2537 = jc.m2537(jc.this);
                Iterator it = mapM2537.keySet().iterator();
                while (it.hasNext()) {
                    jc.this.f2620.post((Runnable) mapM2537.get((il) it.next()));
                }
                if (jc.this.f2622 == null) {
                    jc.this.f2622 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jc.1.2

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f2624 = 1;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2625;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static char[] f2626 = {' ', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'f', 'K', 'G', '3', 'c', 'e', 'j', 'h', 'd', 'B', 'B', 'i', 'Z', '\\', 'i', 'g', 'i'};

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static String m2549(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
                            String str2;
                            Object bytes = str;
                            if (str != null) {
                                bytes = str.getBytes(CharEncoding.ISO_8859_1);
                            }
                            byte[] bArr = (byte[]) bytes;
                            synchronized (h.f2186) {
                                try {
                                    int i2 = iArr[0];
                                    int i3 = iArr[1];
                                    int i4 = iArr[2];
                                    int i5 = iArr[3];
                                    char[] cArr = new char[i3];
                                    System.arraycopy(f2626, i2, cArr, 0, i3);
                                    if (bArr != null) {
                                        char[] cArr2 = new char[i3];
                                        h.f2185 = 0;
                                        char c2 = 0;
                                        while (true) {
                                            int i6 = h.f2185;
                                            if (i6 >= i3) {
                                                break;
                                            }
                                            if (bArr[i6] == 1) {
                                                cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                                            } else {
                                                cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                                            }
                                            c2 = cArr2[i6];
                                            h.f2185 = i6 + 1;
                                        }
                                        cArr = cArr2;
                                    }
                                    if (i5 > 0) {
                                        char[] cArr3 = new char[i3];
                                        System.arraycopy(cArr, 0, cArr3, 0, i3);
                                        int i7 = i3 - i5;
                                        System.arraycopy(cArr3, 0, cArr, i7, i5);
                                        System.arraycopy(cArr3, i5, cArr, 0, i7);
                                    }
                                    if (z2) {
                                        char[] cArr4 = new char[i3];
                                        h.f2185 = 0;
                                        while (true) {
                                            int i8 = h.f2185;
                                            if (i8 >= i3) {
                                                break;
                                            }
                                            cArr4[i8] = cArr[(i3 - i8) - 1];
                                            h.f2185 = i8 + 1;
                                        }
                                        cArr = cArr4;
                                    }
                                    if (i4 > 0) {
                                        h.f2185 = 0;
                                        while (true) {
                                            int i9 = h.f2185;
                                            if (i9 >= i3) {
                                                break;
                                            }
                                            cArr[i9] = (char) (cArr[i9] - iArr[2]);
                                            h.f2185 = i9 + 1;
                                        }
                                    }
                                    str2 = new String(cArr);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return str2;
                        }

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i2 = f2625 + 97;
                            f2624 = i2 % 128;
                            try {
                                if (i2 % 2 == 0) {
                                    s.m2926(this);
                                    throw null;
                                }
                                s.m2926(this);
                                f2624 = (f2625 + 93) % 128;
                            } catch (Throwable th) {
                                n.m2833(m2549(false, new int[]{0, 12, 0, 0}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001").intern(), m2549(false, new int[]{12, 14, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001").intern(), th, false);
                            }
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jc.this.f2622);
            }
        });
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static synchronized jc m2538() {
        try {
            if (f2617 == null) {
                f2617 = new jc();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2617;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2546(il ilVar) {
        s.m2917(new AnonymousClass3(ilVar));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m2547() {
        s.m2917(new AnonymousClass5());
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2548(il ilVar) {
        s.m2917(new AnonymousClass4(ilVar));
    }
}
