package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import android.util.SparseArray;
import androidx.work.WorkRequest;
import com.badlogic.gdx.Input;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class PM implements InterfaceC4177nt {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public C2329Ca C;
    public C2329Ca D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2860Wm f3548a;
    public boolean a0;
    public final C3456fh0 b;
    public InterfaceC4353pt b0;
    public final SparseArray c;
    public final boolean d;
    public final JT e;
    public final JT f;
    public final JT g;
    public final JT h;
    public final JT i;
    public final JT j;
    public final JT k;
    public final JT l;
    public final JT m;
    public final JT n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public OM u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = Ug0.f3833a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AbstractC2333Ce.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        AbstractC3950lJ.y(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        AbstractC3950lJ.y(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(map);
    }

    public PM(int i) {
        C2860Wm c2860Wm = new C2860Wm();
        this.q = -1L;
        this.r = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.s = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.t = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.z = -1L;
        this.A = -1L;
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f3548a = c2860Wm;
        c2860Wm.d = new NN(this);
        this.d = (i & 1) == 0;
        this.b = new C3456fh0();
        this.c = new SparseArray();
        this.g = new JT(4);
        this.h = new JT(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new JT(4);
        this.e = new JT(AbstractC5188zQ.f5325a);
        this.f = new JT(4);
        this.j = new JT();
        this.k = new JT();
        this.l = new JT(8);
        this.m = new JT();
        this.n = new JT();
        this.L = new int[1];
    }

    public static byte[] g(long j, long j2, String str) {
        FW.h(j != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2)));
        int i4 = Ug0.f3833a;
        return str2.getBytes(AbstractC2333Ce.c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:235:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:237:0x0505 A[PHI: r1 r5 r7 r12
  0x0505: PHI (r1v181 java.lang.String) = 
  (r1v69 java.lang.String)
  (r1v70 java.lang.String)
  (r1v71 java.lang.String)
  (r1v104 java.lang.String)
  (r1v110 java.lang.String)
  (r1v115 java.lang.String)
  (r1v182 java.lang.String)
 binds: [B:369:0x07c8, B:365:0x07b4, B:361:0x07a2, B:273:0x05bb, B:264:0x0589, B:260:0x0574, B:236:0x0501] A[DONT_GENERATE, DONT_INLINE]
  0x0505: PHI (r5v89 java.lang.String) = 
  (r5v43 java.lang.String)
  (r5v44 java.lang.String)
  (r5v45 java.lang.String)
  (r5v56 java.lang.String)
  (r5v60 java.lang.String)
  (r5v62 java.lang.String)
  (r5v90 java.lang.String)
 binds: [B:369:0x07c8, B:365:0x07b4, B:361:0x07a2, B:273:0x05bb, B:264:0x0589, B:260:0x0574, B:236:0x0501] A[DONT_GENERATE, DONT_INLINE]
  0x0505: PHI (r7v98 java.lang.String) = 
  (r7v17 java.lang.String)
  (r7v18 java.lang.String)
  (r7v19 java.lang.String)
  (r7v30 java.lang.String)
  (r7v33 java.lang.String)
  (r7v35 java.lang.String)
  (r7v99 java.lang.String)
 binds: [B:369:0x07c8, B:365:0x07b4, B:361:0x07a2, B:273:0x05bb, B:264:0x0589, B:260:0x0574, B:236:0x0501] A[DONT_GENERATE, DONT_INLINE]
  0x0505: PHI (r12v41 java.lang.String) = 
  (r12v3 java.lang.String)
  (r12v4 java.lang.String)
  (r12v5 java.lang.String)
  (r12v28 java.lang.String)
  (r12v32 java.lang.String)
  (r12v34 java.lang.String)
  (r12v42 java.lang.String)
 binds: [B:369:0x07c8, B:365:0x07b4, B:361:0x07a2, B:273:0x05bb, B:264:0x0589, B:260:0x0574, B:236:0x0501] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:264:0x0589 A[PHI: r8 r9 r12
  0x0589: PHI (r8v34 java.lang.String) = (r8v33 java.lang.String), (r8v35 java.lang.String) binds: [B:267:0x05a1, B:263:0x0587] A[DONT_GENERATE, DONT_INLINE]
  0x0589: PHI (r9v42 java.lang.String) = (r9v41 java.lang.String), (r9v43 java.lang.String) binds: [B:267:0x05a1, B:263:0x0587] A[DONT_GENERATE, DONT_INLINE]
  0x0589: PHI (r12v32 java.lang.String) = (r12v31 java.lang.String), (r12v33 java.lang.String) binds: [B:267:0x05a1, B:263:0x0587] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:272:0x05ba A[PHI: r1 r8 r9 r12
  0x05ba: PHI (r1v105 java.lang.String) = 
  (r1v74 java.lang.String)
  (r1v76 java.lang.String)
  (r1v78 java.lang.String)
  (r1v80 java.lang.String)
  (r1v82 java.lang.String)
  (r1v84 java.lang.String)
  (r1v85 java.lang.String)
  (r1v86 java.lang.String)
  (r1v87 java.lang.String)
  (r1v88 java.lang.String)
  (r1v89 java.lang.String)
  (r1v90 java.lang.String)
  (r1v92 java.lang.String)
  (r1v94 java.lang.String)
  (r1v95 java.lang.String)
  (r1v96 java.lang.String)
  (r1v97 java.lang.String)
  (r1v99 java.lang.String)
  (r1v100 java.lang.String)
  (r1v103 java.lang.String)
  (r1v106 java.lang.String)
 binds: [B:353:0x0778, B:349:0x0762, B:345:0x074a, B:341:0x0734, B:337:0x071d, B:333:0x0709, B:329:0x06f5, B:325:0x06df, B:321:0x06c9, B:317:0x06b3, B:313:0x069d, B:309:0x0684, B:305:0x066b, B:301:0x0655, B:297:0x0640, B:293:0x062c, B:289:0x0614, B:285:0x0600, B:281:0x05ec, B:276:0x05d4, B:271:0x05b8] A[DONT_GENERATE, DONT_INLINE]
  0x05ba: PHI (r8v31 java.lang.String) = 
  (r8v9 java.lang.String)
  (r8v10 java.lang.String)
  (r8v11 java.lang.String)
  (r8v12 java.lang.String)
  (r8v13 java.lang.String)
  (r8v14 java.lang.String)
  (r8v15 java.lang.String)
  (r8v16 java.lang.String)
  (r8v17 java.lang.String)
  (r8v18 java.lang.String)
  (r8v19 java.lang.String)
  (r8v20 java.lang.String)
  (r8v21 java.lang.String)
  (r8v22 java.lang.String)
  (r8v23 java.lang.String)
  (r8v24 java.lang.String)
  (r8v25 java.lang.String)
  (r8v26 java.lang.String)
  (r8v27 java.lang.String)
  (r8v29 java.lang.String)
  (r8v32 java.lang.String)
 binds: [B:353:0x0778, B:349:0x0762, B:345:0x074a, B:341:0x0734, B:337:0x071d, B:333:0x0709, B:329:0x06f5, B:325:0x06df, B:321:0x06c9, B:317:0x06b3, B:313:0x069d, B:309:0x0684, B:305:0x066b, B:301:0x0655, B:297:0x0640, B:293:0x062c, B:289:0x0614, B:285:0x0600, B:281:0x05ec, B:276:0x05d4, B:271:0x05b8] A[DONT_GENERATE, DONT_INLINE]
  0x05ba: PHI (r9v39 java.lang.String) = 
  (r9v17 java.lang.String)
  (r9v18 java.lang.String)
  (r9v19 java.lang.String)
  (r9v20 java.lang.String)
  (r9v21 java.lang.String)
  (r9v22 java.lang.String)
  (r9v23 java.lang.String)
  (r9v24 java.lang.String)
  (r9v25 java.lang.String)
  (r9v26 java.lang.String)
  (r9v27 java.lang.String)
  (r9v28 java.lang.String)
  (r9v29 java.lang.String)
  (r9v30 java.lang.String)
  (r9v31 java.lang.String)
  (r9v32 java.lang.String)
  (r9v33 java.lang.String)
  (r9v34 java.lang.String)
  (r9v35 java.lang.String)
  (r9v37 java.lang.String)
  (r9v40 java.lang.String)
 binds: [B:353:0x0778, B:349:0x0762, B:345:0x074a, B:341:0x0734, B:337:0x071d, B:333:0x0709, B:329:0x06f5, B:325:0x06df, B:321:0x06c9, B:317:0x06b3, B:313:0x069d, B:309:0x0684, B:305:0x066b, B:301:0x0655, B:297:0x0640, B:293:0x062c, B:289:0x0614, B:285:0x0600, B:281:0x05ec, B:276:0x05d4, B:271:0x05b8] A[DONT_GENERATE, DONT_INLINE]
  0x05ba: PHI (r12v29 java.lang.String) = 
  (r12v7 java.lang.String)
  (r12v8 java.lang.String)
  (r12v9 java.lang.String)
  (r12v10 java.lang.String)
  (r12v11 java.lang.String)
  (r12v12 java.lang.String)
  (r12v13 java.lang.String)
  (r12v14 java.lang.String)
  (r12v15 java.lang.String)
  (r12v16 java.lang.String)
  (r12v17 java.lang.String)
  (r12v18 java.lang.String)
  (r12v19 java.lang.String)
  (r12v20 java.lang.String)
  (r12v21 java.lang.String)
  (r12v22 java.lang.String)
  (r12v23 java.lang.String)
  (r12v24 java.lang.String)
  (r12v25 java.lang.String)
  (r12v27 java.lang.String)
  (r12v30 java.lang.String)
 binds: [B:353:0x0778, B:349:0x0762, B:345:0x074a, B:341:0x0734, B:337:0x071d, B:333:0x0709, B:329:0x06f5, B:325:0x06df, B:321:0x06c9, B:317:0x06b3, B:313:0x069d, B:309:0x0684, B:305:0x066b, B:301:0x0655, B:297:0x0640, B:293:0x062c, B:289:0x0614, B:285:0x0600, B:281:0x05ec, B:276:0x05d4, B:271:0x05b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:392:0x0893 A[PHI: r2 r36
  0x0893: PHI (r2v148 int) = (r2v111 int), (r2v151 int) binds: [B:504:0x0b10, B:389:0x088c] A[DONT_GENERATE, DONT_INLINE]
  0x0893: PHI (r36v30 java.lang.String) = (r36v8 java.lang.String), (r36v32 java.lang.String) binds: [B:504:0x0b10, B:389:0x088c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:516:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:521:0x0b4f  */
    /* JADX WARN: Code duplicated, block: B:522:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:525:0x0b5e  */
    /* JADX WARN: Code duplicated, block: B:526:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:528:0x0b79  */
    /* JADX WARN: Code duplicated, block: B:530:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:532:0x0b82  */
    /* JADX WARN: Code duplicated, block: B:535:0x0b8a  */
    /* JADX WARN: Code duplicated, block: B:537:0x0b8f  */
    /* JADX WARN: Code duplicated, block: B:540:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:543:0x0ba6  */
    /* JADX WARN: Code duplicated, block: B:546:0x0bac  */
    /* JADX WARN: Code duplicated, block: B:548:0x0bb4  */
    /* JADX WARN: Code duplicated, block: B:566:0x0bea  */
    /* JADX WARN: Code duplicated, block: B:570:0x0c8f  */
    /* JADX WARN: Code duplicated, block: B:573:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:575:0x0ca2  */
    /* JADX WARN: Code duplicated, block: B:576:0x0caf  */
    /* JADX WARN: Code duplicated, block: B:579:0x0cb4  */
    /* JADX WARN: Code duplicated, block: B:585:0x0ccd  */
    /* JADX WARN: Code duplicated, block: B:586:0x0ccf  */
    /* JADX WARN: Code duplicated, block: B:588:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:589:0x0cdc  */
    /* JADX WARN: Code duplicated, block: B:591:0x0ce6  */
    /* JADX WARN: Code duplicated, block: B:597:0x0cfe  */
    /* JADX WARN: Code duplicated, block: B:599:0x0d18  */
    /* JADX WARN: Code duplicated, block: B:601:0x0d26  */
    /* JADX WARN: Code duplicated, block: B:617:0x0d5c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0230 A[PHI: r3
  0x0230: PHI (r3v134 java.lang.String) = 
  (r3v49 java.lang.String)
  (r3v50 java.lang.String)
  (r3v51 java.lang.String)
  (r3v52 java.lang.String)
  (r3v135 java.lang.String)
 binds: [B:116:0x028b, B:112:0x0278, B:108:0x0265, B:104:0x0252, B:95:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0234 A[PHI: r3 r11 r26
  0x0234: PHI (r3v133 java.lang.String) = (r3v45 java.lang.String), (r3v46 java.lang.String), (r3v134 java.lang.String) binds: [B:132:0x02e1, B:128:0x02cd, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r11v44 java.lang.String) = (r11v30 java.lang.String), (r11v31 java.lang.String), (r11v45 java.lang.String) binds: [B:132:0x02e1, B:128:0x02cd, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]
  0x0234: PHI (r26v56 java.lang.String) = (r26v31 java.lang.String), (r26v32 java.lang.String), (r26v57 java.lang.String) binds: [B:132:0x02e1, B:128:0x02cd, B:96:0x0230] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x0236 A[PHI: r3 r11 r20 r26
  0x0236: PHI (r3v132 java.lang.String) = 
  (r3v21 java.lang.String)
  (r3v22 java.lang.String)
  (r3v23 java.lang.String)
  (r3v24 java.lang.String)
  (r3v25 java.lang.String)
  (r3v26 java.lang.String)
  (r3v27 java.lang.String)
  (r3v28 java.lang.String)
  (r3v29 java.lang.String)
  (r3v30 java.lang.String)
  (r3v31 java.lang.String)
  (r3v32 java.lang.String)
  (r3v33 java.lang.String)
  (r3v34 java.lang.String)
  (r3v35 java.lang.String)
  (r3v36 java.lang.String)
  (r3v37 java.lang.String)
  (r3v38 java.lang.String)
  (r3v39 java.lang.String)
  (r3v40 java.lang.String)
  (r3v41 java.lang.String)
  (r3v42 java.lang.String)
  (r3v43 java.lang.String)
  (r3v44 java.lang.String)
  (r3v47 java.lang.String)
  (r3v48 java.lang.String)
  (r3v133 java.lang.String)
 binds: [B:228:0x04d1, B:224:0x04bf, B:220:0x04ad, B:216:0x049b, B:212:0x0489, B:208:0x0476, B:204:0x0461, B:200:0x044e, B:196:0x043a, B:192:0x0426, B:188:0x0412, B:184:0x03fc, B:180:0x03e6, B:176:0x03d0, B:172:0x03ba, B:168:0x03a4, B:164:0x038e, B:160:0x0379, B:156:0x0364, B:152:0x034f, B:148:0x033a, B:144:0x0325, B:140:0x0310, B:136:0x02fa, B:124:0x02bb, B:120:0x02a6, B:97:0x0234] A[DONT_GENERATE, DONT_INLINE]
  0x0236: PHI (r11v43 java.lang.String) = 
  (r11v6 java.lang.String)
  (r11v7 java.lang.String)
  (r11v8 java.lang.String)
  (r11v9 java.lang.String)
  (r11v10 java.lang.String)
  (r11v11 java.lang.String)
  (r11v12 java.lang.String)
  (r11v13 java.lang.String)
  (r11v14 java.lang.String)
  (r11v15 java.lang.String)
  (r11v16 java.lang.String)
  (r11v17 java.lang.String)
  (r11v18 java.lang.String)
  (r11v19 java.lang.String)
  (r11v20 java.lang.String)
  (r11v21 java.lang.String)
  (r11v22 java.lang.String)
  (r11v23 java.lang.String)
  (r11v24 java.lang.String)
  (r11v25 java.lang.String)
  (r11v26 java.lang.String)
  (r11v27 java.lang.String)
  (r11v28 java.lang.String)
  (r11v29 java.lang.String)
  (r11v33 java.lang.String)
  (r11v35 java.lang.String)
  (r11v44 java.lang.String)
 binds: [B:228:0x04d1, B:224:0x04bf, B:220:0x04ad, B:216:0x049b, B:212:0x0489, B:208:0x0476, B:204:0x0461, B:200:0x044e, B:196:0x043a, B:192:0x0426, B:188:0x0412, B:184:0x03fc, B:180:0x03e6, B:176:0x03d0, B:172:0x03ba, B:168:0x03a4, B:164:0x038e, B:160:0x0379, B:156:0x0364, B:152:0x034f, B:148:0x033a, B:144:0x0325, B:140:0x0310, B:136:0x02fa, B:124:0x02bb, B:120:0x02a6, B:97:0x0234] A[DONT_GENERATE, DONT_INLINE]
  0x0236: PHI (r20v51 java.lang.String) = 
  (r20v7 java.lang.String)
  (r20v8 java.lang.String)
  (r20v9 java.lang.String)
  (r20v10 java.lang.String)
  (r20v11 java.lang.String)
  (r20v12 java.lang.String)
  (r20v13 java.lang.String)
  (r20v14 java.lang.String)
  (r20v15 java.lang.String)
  (r20v16 java.lang.String)
  (r20v17 java.lang.String)
  (r20v18 java.lang.String)
  (r20v19 java.lang.String)
  (r20v20 java.lang.String)
  (r20v21 java.lang.String)
  (r20v22 java.lang.String)
  (r20v23 java.lang.String)
  (r20v24 java.lang.String)
  (r20v25 java.lang.String)
  (r20v26 java.lang.String)
  (r20v27 java.lang.String)
  (r20v28 java.lang.String)
  (r20v29 java.lang.String)
  (r20v30 java.lang.String)
  (r20v36 java.lang.String)
  (r20v37 java.lang.String)
  (r20v52 java.lang.String)
 binds: [B:228:0x04d1, B:224:0x04bf, B:220:0x04ad, B:216:0x049b, B:212:0x0489, B:208:0x0476, B:204:0x0461, B:200:0x044e, B:196:0x043a, B:192:0x0426, B:188:0x0412, B:184:0x03fc, B:180:0x03e6, B:176:0x03d0, B:172:0x03ba, B:168:0x03a4, B:164:0x038e, B:160:0x0379, B:156:0x0364, B:152:0x034f, B:148:0x033a, B:144:0x0325, B:140:0x0310, B:136:0x02fa, B:124:0x02bb, B:120:0x02a6, B:97:0x0234] A[DONT_GENERATE, DONT_INLINE]
  0x0236: PHI (r26v55 java.lang.String) = 
  (r26v7 java.lang.String)
  (r26v8 java.lang.String)
  (r26v9 java.lang.String)
  (r26v10 java.lang.String)
  (r26v11 java.lang.String)
  (r26v12 java.lang.String)
  (r26v13 java.lang.String)
  (r26v14 java.lang.String)
  (r26v15 java.lang.String)
  (r26v16 java.lang.String)
  (r26v17 java.lang.String)
  (r26v18 java.lang.String)
  (r26v19 java.lang.String)
  (r26v20 java.lang.String)
  (r26v21 java.lang.String)
  (r26v22 java.lang.String)
  (r26v23 java.lang.String)
  (r26v24 java.lang.String)
  (r26v25 java.lang.String)
  (r26v26 java.lang.String)
  (r26v27 java.lang.String)
  (r26v28 java.lang.String)
  (r26v29 java.lang.String)
  (r26v30 java.lang.String)
  (r26v33 java.lang.String)
  (r26v34 java.lang.String)
  (r26v56 java.lang.String)
 binds: [B:228:0x04d1, B:224:0x04bf, B:220:0x04ad, B:216:0x049b, B:212:0x0489, B:208:0x0476, B:204:0x0461, B:200:0x044e, B:196:0x043a, B:192:0x0426, B:188:0x0412, B:184:0x03fc, B:180:0x03e6, B:176:0x03d0, B:172:0x03ba, B:168:0x03a4, B:164:0x038e, B:160:0x0379, B:156:0x0364, B:152:0x034f, B:148:0x033a, B:144:0x0325, B:140:0x0310, B:136:0x02fa, B:124:0x02bb, B:120:0x02a6, B:97:0x0234] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v36, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v51, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fh0] */
    /* JADX WARN: Type inference failed for: r2v13, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fh0] */
    /* JADX WARN: Type inference failed for: r2v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v142 */
    /* JADX WARN: Type inference failed for: r3v143 */
    /* JADX WARN: Type inference failed for: r3v144 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v146 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ot] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ot] */
    /* JADX WARN: Type inference failed for: r8v1, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        ?? r3;
        boolean z;
        String str6;
        PM pm;
        C2868Wu c2868Wu2;
        ?? r4;
        ?? r5;
        boolean z2;
        int i;
        int i2;
        String str7;
        long j;
        int iB;
        int iA;
        String str8;
        byte b;
        String str9;
        byte b2;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int iY;
        String str15;
        int i3;
        int i4;
        List list;
        Exception exc;
        Pair pair;
        String str16;
        int i5;
        String str17;
        List list2;
        List list3;
        String str18;
        List list4;
        List list5;
        int i6;
        C4531rw c4531rw;
        int i7;
        int i8;
        int i9;
        float f;
        C2879Xf c2879Xf;
        String str19;
        int iIntValue;
        Map map;
        byte[] bArr;
        int i10;
        int i11;
        int i12;
        String str20;
        OM om;
        C3129c c3129cA;
        O30 c2946Zu;
        int i13;
        PM pm2 = this;
        String str21 = "A_PCM/INT/LIT";
        String str22 = "S_TEXT/ASS";
        String str23 = "V_MPEGH/ISO/HEVC";
        String str24 = "S_TEXT/WEBVTT";
        String str25 = "S_TEXT/UTF8";
        String str26 = "A_FLAC";
        pm2.F = false;
        boolean z3 = true;
        while (z3 && !pm2.F) {
            ?? r8 = pm2.f3548a;
            FW.t(r8.d);
            while (true) {
                ArrayDeque arrayDeque = r8.b;
                C2834Vm c2834Vm = (C2834Vm) arrayDeque.peek();
                String str27 = str22;
                if (c2834Vm != null) {
                    str = str26;
                    if (interfaceC4265ot.getPosition() >= c2834Vm.b) {
                        NN nn = r8.d;
                        int i14 = ((C2834Vm) arrayDeque.pop()).f3892a;
                        PM pm3 = (PM) nn.b;
                        FW.t(pm3.b0);
                        SparseArray sparseArray = pm3.c;
                        if (i14 == 160) {
                            str4 = str23;
                            str3 = str24;
                            str6 = str25;
                            str2 = str27;
                            str5 = str21;
                            if (pm3.G == 2) {
                                OM om2 = (OM) sparseArray.get(pm3.M);
                                om2.X.getClass();
                                if (pm3.R > 0 && "A_OPUS".equals(om2.b)) {
                                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(pm3.R).array();
                                    JT jt = pm3.n;
                                    jt.getClass();
                                    jt.C(bArrArray, bArrArray.length);
                                }
                                int i15 = 0;
                                for (int i16 = 0; i16 < pm3.K; i16++) {
                                    i15 += pm3.L[i16];
                                }
                                for (int i17 = 0; i17 < pm3.K; i17++) {
                                    long j2 = pm3.H + ((long) ((om2.e * i17) / 1000));
                                    int i18 = pm3.O;
                                    if (i17 == 0 && !pm3.Q) {
                                        i18 |= 1;
                                    }
                                    int i19 = pm3.L[i17];
                                    i15 -= i19;
                                    pm3.f(om2, j2, i18, i19, i15);
                                }
                                pm3.G = 0;
                            }
                        } else if (i14 != 174) {
                            if (i14 == 19899) {
                                str21 = str21;
                                str4 = str23;
                                str3 = str24;
                                int i20 = pm3.w;
                                if (i20 != -1) {
                                    long j3 = pm3.x;
                                    if (j3 != -1) {
                                        if (i20 == 475249515) {
                                            pm3.z = j3;
                                        }
                                    }
                                }
                                throw KT.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i14 == 25152) {
                                str21 = str21;
                                str4 = str23;
                                str3 = str24;
                                pm3.e(i14);
                                OM om3 = pm3.u;
                                if (om3.h) {
                                    C4238od0 c4238od0 = om3.j;
                                    if (c4238od0 == null) {
                                        throw KT.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    om3.l = new DrmInitData(new DrmInitData.SchemeData(AbstractC4147nc.f4750a, "video/webm", c4238od0.b));
                                }
                            } else if (i14 == 28032) {
                                str21 = str21;
                                str4 = str23;
                                str3 = str24;
                                pm3.e(i14);
                                OM om4 = pm3.u;
                                if (om4.h && om4.i != null) {
                                    throw KT.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i14 == 357149030) {
                                str21 = str21;
                                str4 = str23;
                                str3 = str24;
                                if (pm3.r == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    pm3.r = 1000000L;
                                }
                                long j4 = pm3.s;
                                if (j4 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    pm3.t = pm3.j(j4);
                                }
                            } else if (i14 == 374648427) {
                                str21 = str21;
                                str4 = str23;
                                str3 = str24;
                                if (sparseArray.size() == 0) {
                                    throw KT.a("No valid tracks were found", null);
                                }
                                pm3.b0.endTracks();
                            } else if (i14 != 475249515) {
                                str4 = str23;
                                str3 = str24;
                                str6 = str25;
                                str2 = str27;
                                str5 = str21;
                            } else {
                                if (pm3.v) {
                                    str21 = str21;
                                    str4 = str23;
                                    str3 = str24;
                                } else {
                                    InterfaceC4353pt interfaceC4353pt = pm3.b0;
                                    C2329Ca c2329Ca = pm3.C;
                                    C2329Ca c2329Ca2 = pm3.D;
                                    if (pm3.q == -1 || pm3.t == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET || c2329Ca == null || (i13 = c2329Ca.f2927a) == 0 || c2329Ca2 == null || c2329Ca2.f2927a != i13) {
                                        str4 = str23;
                                        str3 = str24;
                                        c2946Zu = new C2946Zu(pm3.t);
                                    } else {
                                        int[] iArrCopyOf = new int[i13];
                                        long[] jArrCopyOf = new long[i13];
                                        long[] jArrCopyOf2 = new long[i13];
                                        long[] jArrCopyOf3 = new long[i13];
                                        int i21 = 0;
                                        while (i21 < i13) {
                                            jArrCopyOf3[i21] = c2329Ca.e(i21);
                                            jArrCopyOf[i21] = c2329Ca2.e(i21) + pm3.q;
                                            i21++;
                                            c2329Ca = c2329Ca;
                                            str23 = str23;
                                        }
                                        str4 = str23;
                                        int i22 = 0;
                                        while (true) {
                                            int i23 = i13 - 1;
                                            if (i22 < i23) {
                                                int i24 = i22 + 1;
                                                iArrCopyOf[i22] = (int) (jArrCopyOf[i24] - jArrCopyOf[i22]);
                                                jArrCopyOf2[i22] = jArrCopyOf3[i24] - jArrCopyOf3[i22];
                                                i22 = i24;
                                                str24 = str24;
                                            } else {
                                                str3 = str24;
                                                iArrCopyOf[i23] = (int) ((pm3.q + pm3.p) - jArrCopyOf[i23]);
                                                long j5 = pm3.t - jArrCopyOf3[i23];
                                                jArrCopyOf2[i23] = j5;
                                                if (j5 <= 0) {
                                                    AbstractC4038mJ.f();
                                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i23);
                                                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i23);
                                                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i23);
                                                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i23);
                                                }
                                                c2946Zu = new C2644Oe(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                                            }
                                        }
                                    }
                                    interfaceC4353pt.a(c2946Zu);
                                    pm3.v = true;
                                }
                                pm3.C = null;
                                pm3.D = null;
                            }
                            str2 = str27;
                            str5 = str21;
                            str6 = str25;
                        } else {
                            String str28 = str21;
                            str4 = str23;
                            str3 = str24;
                            OM om5 = pm3.u;
                            FW.t(om5);
                            String str29 = om5.b;
                            if (str29 == null) {
                                throw KT.a("CodecId is missing in TrackEntry element", null);
                            }
                            switch (str29.hashCode()) {
                                case -2095576542:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_MPEG4/ISO/AP")) {
                                        b = 0;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -2095575984:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_MPEG4/ISO/SP")) {
                                        b = 1;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1985379776:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_MS/ACM")) {
                                        b = 2;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1784763192:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_TRUEHD")) {
                                        b = 3;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1730367663:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_VORBIS")) {
                                        b = 4;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641358:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_MPEG/L2")) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1482641357:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_MPEG/L3")) {
                                        b = 6;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -1373388978:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_MS/VFW/FOURCC")) {
                                        b = 7;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -933872740:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("S_DVBSUB")) {
                                        b = 8;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363189:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_MPEG4/ISO/ASP")) {
                                        b = 9;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -538363109:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_MPEG4/ISO/AVC")) {
                                        b = 10;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -425012669:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("S_VOBSUB")) {
                                        b = 11;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case -356037306:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_DTS/LOSSLESS")) {
                                        b = 12;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923557:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_AAC")) {
                                        b = com.umeng.analytics.pro.cw.k;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62923603:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_AC3")) {
                                        b = com.umeng.analytics.pro.cw.l;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 62927045:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_DTS")) {
                                        b = com.umeng.analytics.pro.cw.m;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82318131:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_AV1")) {
                                        b = com.umeng.analytics.pro.cw.n;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338133:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_VP8")) {
                                        b = 17;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 82338134:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_VP9")) {
                                        b = 18;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 99146302:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("S_HDMV/PGS")) {
                                        b = 19;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 444813526:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("V_THEORA")) {
                                        b = 20;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 542569478:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_DTS/EXPRESS")) {
                                        b = 21;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 635596514:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_PCM/FLOAT/IEEE")) {
                                        b = 22;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 725948237:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals("A_PCM/INT/BIG")) {
                                        b = 23;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 725957860:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    if (str29.equals(str28)) {
                                        str5 = str28;
                                        b = 24;
                                    } else {
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 738597099:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    if (str29.equals(str2)) {
                                        str5 = str28;
                                        b = 25;
                                    } else {
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 855502857:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals(str4)) {
                                        b = 26;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1045209816:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    if (str29.equals(str3)) {
                                        b = 27;
                                    } else {
                                        b = -1;
                                    }
                                    break;
                                case 1422270023:
                                    str = str;
                                    if (str29.equals(str25)) {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = 28;
                                    } else {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 1809237540:
                                    str = str;
                                    if (str29.equals("V_MPEG2")) {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = 29;
                                    } else {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 1950749482:
                                    str = str;
                                    if (str29.equals("A_EAC3")) {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = 30;
                                    } else {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 1950789798:
                                    str = str;
                                    if (str29.equals(str)) {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = 31;
                                    } else {
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = -1;
                                    }
                                    break;
                                case 1951062397:
                                    if (str29.equals("A_OPUS")) {
                                        str = str;
                                        str8 = str25;
                                        str2 = str27;
                                        str5 = str28;
                                        b = 32;
                                        break;
                                    }
                                default:
                                    str = str;
                                    str8 = str25;
                                    str2 = str27;
                                    str5 = str28;
                                    b = -1;
                                    break;
                            }
                            switch (b) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    InterfaceC4353pt interfaceC4353pt2 = pm3.b0;
                                    ?? r0 = om5;
                                    int i25 = r0.c;
                                    switch (str29.hashCode()) {
                                        case -2095576542:
                                            str5 = str5;
                                            str9 = str8;
                                            str4 = str4;
                                            str3 = str3;
                                            if (str29.equals("V_MPEG4/ISO/AP")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -2095575984:
                                            str5 = str5;
                                            str9 = str8;
                                            str4 = str4;
                                            str3 = str3;
                                            if (str29.equals("V_MPEG4/ISO/SP")) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -1985379776:
                                            str5 = str5;
                                            str9 = str8;
                                            str4 = str4;
                                            str3 = str3;
                                            if (str29.equals("A_MS/ACM")) {
                                                b2 = 2;
                                            } else {
                                                b2 = -1;
                                            }
                                            break;
                                        case -1784763192:
                                            str5 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_TRUEHD")) {
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 3;
                                            } else {
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -1730367663:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_VORBIS")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 4;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -1482641358:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_MPEG/L2")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 5;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -1482641357:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_MPEG/L3")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 6;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -1373388978:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_MS/VFW/FOURCC")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 7;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -933872740:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("S_DVBSUB")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 8;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case -538363189:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_MPEG4/ISO/ASP")) {
                                                b2 = 9;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case -538363109:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_MPEG4/ISO/AVC")) {
                                                b2 = 10;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case -425012669:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("S_VOBSUB")) {
                                                b2 = 11;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case -356037306:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_DTS/LOSSLESS")) {
                                                b2 = 12;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 62923557:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_AAC")) {
                                                b2 = com.umeng.analytics.pro.cw.k;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 62923603:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_AC3")) {
                                                b2 = com.umeng.analytics.pro.cw.l;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 62927045:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_DTS")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = com.umeng.analytics.pro.cw.m;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case 82318131:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_AV1")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = com.umeng.analytics.pro.cw.n;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case 82338133:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_VP8")) {
                                                b2 = 17;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 82338134:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_VP9")) {
                                                b2 = 18;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 99146302:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("S_HDMV/PGS")) {
                                                b2 = 19;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 444813526:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("V_THEORA")) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 20;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case 542569478:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_DTS/EXPRESS")) {
                                                b2 = 21;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 635596514:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_PCM/FLOAT/IEEE")) {
                                                b2 = 22;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 725948237:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals("A_PCM/INT/BIG")) {
                                                b2 = 23;
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                            }
                                            str5 = str12;
                                            str4 = str10;
                                            str3 = str11;
                                            b2 = -1;
                                            break;
                                        case 725957860:
                                            str12 = str5;
                                            str9 = str8;
                                            str10 = str4;
                                            str11 = str3;
                                            if (str29.equals(str12)) {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = 24;
                                            } else {
                                                str5 = str12;
                                                str4 = str10;
                                                str3 = str11;
                                                b2 = -1;
                                            }
                                            break;
                                        case 738597099:
                                            str9 = str8;
                                            str13 = str4;
                                            str14 = str3;
                                            if (str29.equals(str2)) {
                                                str4 = str13;
                                                str3 = str14;
                                                str5 = str5;
                                                b2 = 25;
                                            } else {
                                                str4 = str13;
                                                str3 = str14;
                                                str5 = str5;
                                                b2 = -1;
                                            }
                                            break;
                                        case 855502857:
                                            str9 = str8;
                                            str13 = str4;
                                            str14 = str3;
                                            if (str29.equals(str13)) {
                                                str4 = str13;
                                                str3 = str14;
                                                str5 = str5;
                                                b2 = 26;
                                            } else {
                                                str4 = str13;
                                                str3 = str14;
                                                str5 = str5;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1045209816:
                                            str9 = str8;
                                            str3 = str3;
                                            str5 = str5;
                                            if (str29.equals(str3)) {
                                                str4 = str4;
                                                b2 = 27;
                                            } else {
                                                str4 = str4;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1422270023:
                                            str9 = str8;
                                            str5 = str5;
                                            if (str29.equals(str9)) {
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = 28;
                                            } else {
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1809237540:
                                            if (str29.equals("V_MPEG2")) {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = 29;
                                            } else {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1950749482:
                                            if (str29.equals("A_EAC3")) {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = 30;
                                            } else {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1950789798:
                                            if (str29.equals(str)) {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = 31;
                                            } else {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = -1;
                                            }
                                            break;
                                        case 1951062397:
                                            if (str29.equals("A_OPUS")) {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = 32;
                                            } else {
                                                str5 = str5;
                                                str9 = str8;
                                                str4 = str4;
                                                str3 = str3;
                                                b2 = -1;
                                            }
                                            break;
                                        default:
                                            str5 = str5;
                                            str9 = str8;
                                            str4 = str4;
                                            str3 = str3;
                                            b2 = -1;
                                            break;
                                    }
                                    String str30 = MimeTypes.AUDIO_RAW;
                                    switch (b2) {
                                        case 0:
                                        case 1:
                                        case 9:
                                            str3 = str3;
                                            byte[] bArr2 = r0.k;
                                            List listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                            str30 = MimeTypes.VIDEO_MP4V;
                                            list5 = listSingletonList;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null && (c3129cA = C3129c.a(new JT(r0.N))) != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z4 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i26 = (z4 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8 || (i10 = r0.p) == i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = (r0.n * i9) / (r0.m * i10);
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f && r0.E != -1.0f && r0.F != -1.0f && r0.G != -1.0f && r0.H != -1.0f && r0.I != -1.0f && r0.J != -1.0f && r0.K != -1.0f && r0.L != -1.0f && r0.M != -1.0f) {
                                                        bArr = new byte[25];
                                                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                                        byteBufferOrder.put((byte) 0);
                                                        byteBufferOrder.putShort((short) ((r0.D * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.E * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.F * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.G * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.H * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.I * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.J * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) ((r0.K * 50000.0f) + 0.5f));
                                                        byteBufferOrder.putShort((short) (r0.L + 0.5f));
                                                        byteBufferOrder.putShort((short) (r0.M + 0.5f));
                                                        byteBufferOrder.putShort((short) r0.B);
                                                        byteBufferOrder.putShort((short) r0.C);
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0 && Float.compare(r0.s, 0.0f) == 0 && Float.compare(r0.t, 0.0f) == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0 || Float.compare(r0.t, 180.0f) == 0) {
                                                        iIntValue = 180;
                                                    } else if (Float.compare(r0.t, -90.0f) == 0) {
                                                        iIntValue = 270;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30) && !MimeTypes.TEXT_SSA.equals(str30) && !MimeTypes.TEXT_VTT.equals(str30) && !MimeTypes.APPLICATION_VOBSUB.equals(str30) && !MimeTypes.APPLICATION_PGS.equals(str30) && !MimeTypes.APPLICATION_DVBSUBS.equals(str30)) {
                                                    throw KT.a("Unexpected MIME type.", null);
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null && !h0.containsKey(str20)) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i26;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track;
                                            interfaceC4326pd0Track.e(c4619swA);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 2:
                                            str3 = str3;
                                            JT jt2 = new JT(r0.a(r0.b));
                                            try {
                                                int iM = jt2.m();
                                                if (iM != 1) {
                                                    if (iM == 65534) {
                                                        jt2.E(24);
                                                        long jN = jt2.n();
                                                        UUID uuid = g0;
                                                        if (jN != uuid.getMostSignificantBits() || jt2.n() != uuid.getLeastSignificantBits()) {
                                                        }
                                                        str30 = MimeTypes.AUDIO_UNKNOWN;
                                                        list5 = null;
                                                        str15 = null;
                                                        i3 = -1;
                                                        list4 = list5;
                                                        i4 = -1;
                                                        list = list4;
                                                        if (r0.N != null) {
                                                            str15 = c3129cA.f4197a;
                                                            str30 = "video/dolby-vision";
                                                        }
                                                        boolean z5 = r0.V;
                                                        if (r0.U) {
                                                            i6 = 2;
                                                        } else {
                                                            i6 = 0;
                                                        }
                                                        int i27 = (z5 ? 1 : 0) | i6;
                                                        c4531rw = new C4531rw();
                                                        if (AbstractC5011xP.k(str30)) {
                                                            c4531rw.x = r0.O;
                                                            c4531rw.y = r0.Q;
                                                            c4531rw.z = i3;
                                                            str = str;
                                                            str5 = str5;
                                                            str2 = str2;
                                                            i7 = 1;
                                                        } else if (AbstractC5011xP.m(str30)) {
                                                            if (r0.q == 0) {
                                                                i11 = r0.o;
                                                                i8 = -1;
                                                                if (i11 == -1) {
                                                                    i11 = r0.m;
                                                                }
                                                                r0.o = i11;
                                                                i12 = r0.p;
                                                                if (i12 == -1) {
                                                                    i12 = r0.n;
                                                                }
                                                                r0.p = i12;
                                                            } else {
                                                                i8 = -1;
                                                            }
                                                            i9 = r0.o;
                                                            if (i9 != i8) {
                                                                f = -1.0f;
                                                            } else {
                                                                f = -1.0f;
                                                            }
                                                            if (r0.x) {
                                                                bArr = r0.D == -1.0f ? null : null;
                                                                c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                            } else {
                                                                str = str;
                                                                c2879Xf = null;
                                                            }
                                                            str19 = r0.f3501a;
                                                            if (str19 != null) {
                                                                map = h0;
                                                                if (map.containsKey(str19)) {
                                                                    iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                            if (r0.r == 0) {
                                                                if (Float.compare(r0.u, 0.0f) == 0) {
                                                                    iIntValue = 0;
                                                                } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                                    iIntValue = 90;
                                                                } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                                    iIntValue = 180;
                                                                } else {
                                                                    iIntValue = 180;
                                                                }
                                                            }
                                                            c4531rw.p = r0.m;
                                                            c4531rw.q = r0.n;
                                                            c4531rw.t = f;
                                                            c4531rw.s = iIntValue;
                                                            c4531rw.u = r0.v;
                                                            c4531rw.v = r0.w;
                                                            c4531rw.w = c2879Xf;
                                                            i7 = 2;
                                                        } else {
                                                            str = str;
                                                            str5 = str5;
                                                            str2 = str2;
                                                            if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                            }
                                                            i7 = 3;
                                                        }
                                                        str20 = r0.f3501a;
                                                        if (str20 != null) {
                                                            c4531rw.b = r0.f3501a;
                                                        }
                                                        c4531rw.f4954a = Integer.toString(i25);
                                                        c4531rw.k = str30;
                                                        c4531rw.l = i4;
                                                        c4531rw.c = r0.W;
                                                        c4531rw.d = i27;
                                                        c4531rw.m = list;
                                                        c4531rw.h = str15;
                                                        c4531rw.n = r0.l;
                                                        C4619sw c4619swA2 = c4531rw.a();
                                                        InterfaceC4326pd0 interfaceC4326pd0Track2 = interfaceC4353pt2.track(r0.c, i7);
                                                        r0.X = interfaceC4326pd0Track2;
                                                        interfaceC4326pd0Track2.e(c4619swA2);
                                                        sparseArray.put(r0.c, r0);
                                                        om = null;
                                                    }
                                                    AbstractC4038mJ.f();
                                                    str30 = MimeTypes.AUDIO_UNKNOWN;
                                                    list5 = null;
                                                    str15 = null;
                                                    i3 = -1;
                                                    list4 = list5;
                                                    i4 = -1;
                                                    list = list4;
                                                    if (r0.N != null) {
                                                        str15 = c3129cA.f4197a;
                                                        str30 = "video/dolby-vision";
                                                    }
                                                    boolean z6 = r0.V;
                                                    if (r0.U) {
                                                        i6 = 2;
                                                    } else {
                                                        i6 = 0;
                                                    }
                                                    int i28 = (z6 ? 1 : 0) | i6;
                                                    c4531rw = new C4531rw();
                                                    if (AbstractC5011xP.k(str30)) {
                                                        c4531rw.x = r0.O;
                                                        c4531rw.y = r0.Q;
                                                        c4531rw.z = i3;
                                                        str = str;
                                                        str5 = str5;
                                                        str2 = str2;
                                                        i7 = 1;
                                                    } else if (AbstractC5011xP.m(str30)) {
                                                        if (r0.q == 0) {
                                                            i11 = r0.o;
                                                            i8 = -1;
                                                            if (i11 == -1) {
                                                                i11 = r0.m;
                                                            }
                                                            r0.o = i11;
                                                            i12 = r0.p;
                                                            if (i12 == -1) {
                                                                i12 = r0.n;
                                                            }
                                                            r0.p = i12;
                                                        } else {
                                                            i8 = -1;
                                                        }
                                                        i9 = r0.o;
                                                        if (i9 != i8) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (r0.x) {
                                                            if (r0.D == -1.0f) {
                                                            }
                                                            c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                        } else {
                                                            str = str;
                                                            c2879Xf = null;
                                                        }
                                                        str19 = r0.f3501a;
                                                        if (str19 != null) {
                                                            map = h0;
                                                            if (map.containsKey(str19)) {
                                                                iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (r0.r == 0) {
                                                            if (Float.compare(r0.u, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                                iIntValue = 180;
                                                            } else {
                                                                iIntValue = 180;
                                                            }
                                                        }
                                                        c4531rw.p = r0.m;
                                                        c4531rw.q = r0.n;
                                                        c4531rw.t = f;
                                                        c4531rw.s = iIntValue;
                                                        c4531rw.u = r0.v;
                                                        c4531rw.v = r0.w;
                                                        c4531rw.w = c2879Xf;
                                                        i7 = 2;
                                                    } else {
                                                        str = str;
                                                        str5 = str5;
                                                        str2 = str2;
                                                        if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                        }
                                                        i7 = 3;
                                                    }
                                                    str20 = r0.f3501a;
                                                    if (str20 != null) {
                                                        c4531rw.b = r0.f3501a;
                                                    }
                                                    c4531rw.f4954a = Integer.toString(i25);
                                                    c4531rw.k = str30;
                                                    c4531rw.l = i4;
                                                    c4531rw.c = r0.W;
                                                    c4531rw.d = i28;
                                                    c4531rw.m = list;
                                                    c4531rw.h = str15;
                                                    c4531rw.n = r0.l;
                                                    C4619sw c4619swA3 = c4531rw.a();
                                                    InterfaceC4326pd0 interfaceC4326pd0Track3 = interfaceC4353pt2.track(r0.c, i7);
                                                    r0.X = interfaceC4326pd0Track3;
                                                    interfaceC4326pd0Track3.e(c4619swA3);
                                                    sparseArray.put(r0.c, r0);
                                                    om = null;
                                                    break;
                                                }
                                                iY = Ug0.y(r0.P);
                                                if (iY == 0) {
                                                    AbstractC4038mJ.f();
                                                    str30 = MimeTypes.AUDIO_UNKNOWN;
                                                    list5 = null;
                                                    str15 = null;
                                                    i3 = -1;
                                                    list4 = list5;
                                                } else {
                                                    i3 = iY;
                                                    list4 = null;
                                                    str15 = null;
                                                }
                                                i4 = -1;
                                                list = list4;
                                                if (r0.N != null) {
                                                    str15 = c3129cA.f4197a;
                                                    str30 = "video/dolby-vision";
                                                }
                                                boolean z7 = r0.V;
                                                if (r0.U) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i29 = (z7 ? 1 : 0) | i6;
                                                c4531rw = new C4531rw();
                                                if (AbstractC5011xP.k(str30)) {
                                                    c4531rw.x = r0.O;
                                                    c4531rw.y = r0.Q;
                                                    c4531rw.z = i3;
                                                    str = str;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    i7 = 1;
                                                } else if (AbstractC5011xP.m(str30)) {
                                                    if (r0.q == 0) {
                                                        i11 = r0.o;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = r0.m;
                                                        }
                                                        r0.o = i11;
                                                        i12 = r0.p;
                                                        if (i12 == -1) {
                                                            i12 = r0.n;
                                                        }
                                                        r0.p = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = r0.o;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (r0.x) {
                                                        if (r0.D == -1.0f) {
                                                        }
                                                        c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                    } else {
                                                        str = str;
                                                        c2879Xf = null;
                                                    }
                                                    str19 = r0.f3501a;
                                                    if (str19 != null) {
                                                        map = h0;
                                                        if (map.containsKey(str19)) {
                                                            iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r0.r == 0) {
                                                        if (Float.compare(r0.u, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c4531rw.p = r0.m;
                                                    c4531rw.q = r0.n;
                                                    c4531rw.t = f;
                                                    c4531rw.s = iIntValue;
                                                    c4531rw.u = r0.v;
                                                    c4531rw.v = r0.w;
                                                    c4531rw.w = c2879Xf;
                                                    i7 = 2;
                                                } else {
                                                    str = str;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                    }
                                                    i7 = 3;
                                                }
                                                str20 = r0.f3501a;
                                                if (str20 != null) {
                                                    c4531rw.b = r0.f3501a;
                                                }
                                                c4531rw.f4954a = Integer.toString(i25);
                                                c4531rw.k = str30;
                                                c4531rw.l = i4;
                                                c4531rw.c = r0.W;
                                                c4531rw.d = i29;
                                                c4531rw.m = list;
                                                c4531rw.h = str15;
                                                c4531rw.n = r0.l;
                                                C4619sw c4619swA4 = c4531rw.a();
                                                InterfaceC4326pd0 interfaceC4326pd0Track4 = interfaceC4353pt2.track(r0.c, i7);
                                                r0.X = interfaceC4326pd0Track4;
                                                interfaceC4326pd0Track4.e(c4619swA4);
                                                sparseArray.put(r0.c, r0);
                                                om = null;
                                            } catch (ArrayIndexOutOfBoundsException unused) {
                                                throw KT.a("Error parsing MS/ACM codec private", null);
                                            }
                                            break;
                                        case 3:
                                            str3 = str3;
                                            r0.T = new C3626he0();
                                            str30 = MimeTypes.AUDIO_TRUEHD;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z8 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i210 = (z8 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i210;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA5 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track5 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track5;
                                            interfaceC4326pd0Track5.e(c4619swA5);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 4:
                                            str3 = str3;
                                            byte[] bArrA = r0.a(r0.b);
                                            try {
                                                try {
                                                    if (bArrA[0] != 2) {
                                                        throw KT.a("Error parsing vorbis codec private", null);
                                                    }
                                                    int i30 = 0;
                                                    int i31 = 1;
                                                    while (true) {
                                                        int i32 = bArrA[i31] & 255;
                                                        if (i32 != 255) {
                                                            int i33 = i31 + 1;
                                                            int i34 = i30 + i32;
                                                            int i35 = 0;
                                                            while (true) {
                                                                int i36 = bArrA[i33] & 255;
                                                                if (i36 != 255) {
                                                                    int i37 = i33 + 1;
                                                                    int i38 = i35 + i36;
                                                                    if (bArrA[i37] != 1) {
                                                                        throw KT.a("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr3 = new byte[i34];
                                                                    System.arraycopy(bArrA, i37, bArr3, 0, i34);
                                                                    int i39 = i37 + i34;
                                                                    if (bArrA[i39] != 3) {
                                                                        throw KT.a("Error parsing vorbis codec private", null);
                                                                    }
                                                                    int i40 = i39 + i38;
                                                                    if (bArrA[i40] != 5) {
                                                                        throw KT.a("Error parsing vorbis codec private", null);
                                                                    }
                                                                    byte[] bArr4 = new byte[bArrA.length - i40];
                                                                    System.arraycopy(bArrA, i40, bArr4, 0, bArrA.length - i40);
                                                                    ArrayList arrayList = new ArrayList(2);
                                                                    arrayList.add(bArr3);
                                                                    arrayList.add(bArr4);
                                                                    str30 = MimeTypes.AUDIO_VORBIS;
                                                                    str15 = null;
                                                                    i3 = -1;
                                                                    i4 = 8192;
                                                                    list = arrayList;
                                                                    if (r0.N != null) {
                                                                        str15 = c3129cA.f4197a;
                                                                        str30 = "video/dolby-vision";
                                                                    }
                                                                    boolean z9 = r0.V;
                                                                    if (r0.U) {
                                                                        i6 = 2;
                                                                    } else {
                                                                        i6 = 0;
                                                                    }
                                                                    int i211 = (z9 ? 1 : 0) | i6;
                                                                    c4531rw = new C4531rw();
                                                                    if (AbstractC5011xP.k(str30)) {
                                                                        c4531rw.x = r0.O;
                                                                        c4531rw.y = r0.Q;
                                                                        c4531rw.z = i3;
                                                                        str = str;
                                                                        str5 = str5;
                                                                        str2 = str2;
                                                                        i7 = 1;
                                                                    } else if (AbstractC5011xP.m(str30)) {
                                                                        if (r0.q == 0) {
                                                                            i11 = r0.o;
                                                                            i8 = -1;
                                                                            if (i11 == -1) {
                                                                                i11 = r0.m;
                                                                            }
                                                                            r0.o = i11;
                                                                            i12 = r0.p;
                                                                            if (i12 == -1) {
                                                                                i12 = r0.n;
                                                                            }
                                                                            r0.p = i12;
                                                                        } else {
                                                                            i8 = -1;
                                                                        }
                                                                        i9 = r0.o;
                                                                        if (i9 != i8) {
                                                                            f = -1.0f;
                                                                        } else {
                                                                            f = -1.0f;
                                                                        }
                                                                        if (r0.x) {
                                                                            if (r0.D == -1.0f) {
                                                                            }
                                                                            c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                                        } else {
                                                                            str = str;
                                                                            c2879Xf = null;
                                                                        }
                                                                        str19 = r0.f3501a;
                                                                        if (str19 != null) {
                                                                            map = h0;
                                                                            if (map.containsKey(str19)) {
                                                                                iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                                            } else {
                                                                                iIntValue = -1;
                                                                            }
                                                                        } else {
                                                                            iIntValue = -1;
                                                                        }
                                                                        if (r0.r == 0) {
                                                                            if (Float.compare(r0.u, 0.0f) == 0) {
                                                                                iIntValue = 0;
                                                                            } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                                                iIntValue = 90;
                                                                            } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                                                iIntValue = 180;
                                                                            } else {
                                                                                iIntValue = 180;
                                                                            }
                                                                        }
                                                                        c4531rw.p = r0.m;
                                                                        c4531rw.q = r0.n;
                                                                        c4531rw.t = f;
                                                                        c4531rw.s = iIntValue;
                                                                        c4531rw.u = r0.v;
                                                                        c4531rw.v = r0.w;
                                                                        c4531rw.w = c2879Xf;
                                                                        i7 = 2;
                                                                    } else {
                                                                        str = str;
                                                                        str5 = str5;
                                                                        str2 = str2;
                                                                        if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                                        }
                                                                        i7 = 3;
                                                                    }
                                                                    str20 = r0.f3501a;
                                                                    if (str20 != null) {
                                                                        c4531rw.b = r0.f3501a;
                                                                    }
                                                                    c4531rw.f4954a = Integer.toString(i25);
                                                                    c4531rw.k = str30;
                                                                    c4531rw.l = i4;
                                                                    c4531rw.c = r0.W;
                                                                    c4531rw.d = i211;
                                                                    c4531rw.m = list;
                                                                    c4531rw.h = str15;
                                                                    c4531rw.n = r0.l;
                                                                    C4619sw c4619swA6 = c4531rw.a();
                                                                    InterfaceC4326pd0 interfaceC4326pd0Track6 = interfaceC4353pt2.track(r0.c, i7);
                                                                    r0.X = interfaceC4326pd0Track6;
                                                                    interfaceC4326pd0Track6.e(c4619swA6);
                                                                    sparseArray.put(r0.c, r0);
                                                                    om = null;
                                                                } else {
                                                                    i35 += 255;
                                                                    i33++;
                                                                }
                                                            }
                                                        } else {
                                                            i30 += 255;
                                                            i31++;
                                                        }
                                                    }
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    throw KT.a("Error parsing vorbis codec private", r0);
                                                }
                                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                                r0 = 0;
                                            }
                                            break;
                                        case 5:
                                            str30 = MimeTypes.AUDIO_MPEG_L2;
                                            list = null;
                                            str15 = null;
                                            i3 = -1;
                                            i4 = 4096;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z10 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i212 = (z10 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i212;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA7 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track7 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track7;
                                            interfaceC4326pd0Track7.e(c4619swA7);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 6:
                                            str30 = MimeTypes.AUDIO_MPEG;
                                            list = null;
                                            str15 = null;
                                            i3 = -1;
                                            i4 = 4096;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z11 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i213 = (z11 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i213;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA8 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track8 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track8;
                                            interfaceC4326pd0Track8.e(c4619swA8);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 7:
                                            JT jt3 = new JT(r0.a(r0.b));
                                            try {
                                                jt3.F(16);
                                                long jK = jt3.k();
                                                if (jK == 1482049860) {
                                                    exc = null;
                                                    try {
                                                        pair = new Pair("video/divx", null);
                                                        str16 = null;
                                                    } catch (ArrayIndexOutOfBoundsException unused4) {
                                                    }
                                                } else {
                                                    if (jK == 859189832) {
                                                        pair = new Pair(MimeTypes.VIDEO_H263, null);
                                                    } else {
                                                        if (jK == 826496599) {
                                                            int i41 = jt3.b + 20;
                                                            byte[] bArr5 = jt3.f3266a;
                                                            while (true) {
                                                                if (i41 < bArr5.length - 4) {
                                                                    if (bArr5[i41] == 0) {
                                                                        i5 = 1;
                                                                        if (bArr5[i41 + 1] == 0 && bArr5[i41 + 2] == 1) {
                                                                            if (bArr5[i41 + 3] == 15) {
                                                                                pair = new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArr5, i41, bArr5.length)));
                                                                            }
                                                                        }
                                                                        i41 += i5;
                                                                    }
                                                                    i5 = 1;
                                                                    i41 += i5;
                                                                } else {
                                                                    try {
                                                                        throw KT.a("Failed to find FourCC VC1 initialization data", null);
                                                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                                                        exc = null;
                                                                    }
                                                                }
                                                                throw KT.a("Error parsing FourCC private data", exc);
                                                            }
                                                        }
                                                        AbstractC4038mJ.f();
                                                        str16 = null;
                                                        pair = new Pair(MimeTypes.VIDEO_UNKNOWN, null);
                                                    }
                                                    str16 = null;
                                                }
                                                str17 = (String) pair.first;
                                                list2 = (List) pair.second;
                                                i3 = -1;
                                                i4 = -1;
                                                String str31 = str16;
                                                str30 = str17;
                                                str15 = str31;
                                                list = list2;
                                                if (r0.N != null) {
                                                    str15 = c3129cA.f4197a;
                                                    str30 = "video/dolby-vision";
                                                }
                                                boolean z12 = r0.V;
                                                if (r0.U) {
                                                    i6 = 2;
                                                } else {
                                                    i6 = 0;
                                                }
                                                int i214 = (z12 ? 1 : 0) | i6;
                                                c4531rw = new C4531rw();
                                                if (AbstractC5011xP.k(str30)) {
                                                    c4531rw.x = r0.O;
                                                    c4531rw.y = r0.Q;
                                                    c4531rw.z = i3;
                                                    str = str;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    i7 = 1;
                                                } else if (AbstractC5011xP.m(str30)) {
                                                    if (r0.q == 0) {
                                                        i11 = r0.o;
                                                        i8 = -1;
                                                        if (i11 == -1) {
                                                            i11 = r0.m;
                                                        }
                                                        r0.o = i11;
                                                        i12 = r0.p;
                                                        if (i12 == -1) {
                                                            i12 = r0.n;
                                                        }
                                                        r0.p = i12;
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                    i9 = r0.o;
                                                    if (i9 != i8) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (r0.x) {
                                                        if (r0.D == -1.0f) {
                                                        }
                                                        c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                    } else {
                                                        str = str;
                                                        c2879Xf = null;
                                                    }
                                                    str19 = r0.f3501a;
                                                    if (str19 != null) {
                                                        map = h0;
                                                        if (map.containsKey(str19)) {
                                                            iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (r0.r == 0) {
                                                        if (Float.compare(r0.u, 0.0f) == 0) {
                                                            iIntValue = 0;
                                                        } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                            iIntValue = 90;
                                                        } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                            iIntValue = 180;
                                                        } else {
                                                            iIntValue = 180;
                                                        }
                                                    }
                                                    c4531rw.p = r0.m;
                                                    c4531rw.q = r0.n;
                                                    c4531rw.t = f;
                                                    c4531rw.s = iIntValue;
                                                    c4531rw.u = r0.v;
                                                    c4531rw.v = r0.w;
                                                    c4531rw.w = c2879Xf;
                                                    i7 = 2;
                                                } else {
                                                    str = str;
                                                    str5 = str5;
                                                    str2 = str2;
                                                    if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                    }
                                                    i7 = 3;
                                                }
                                                str20 = r0.f3501a;
                                                if (str20 != null) {
                                                    c4531rw.b = r0.f3501a;
                                                }
                                                c4531rw.f4954a = Integer.toString(i25);
                                                c4531rw.k = str30;
                                                c4531rw.l = i4;
                                                c4531rw.c = r0.W;
                                                c4531rw.d = i214;
                                                c4531rw.m = list;
                                                c4531rw.h = str15;
                                                c4531rw.n = r0.l;
                                                C4619sw c4619swA9 = c4531rw.a();
                                                InterfaceC4326pd0 interfaceC4326pd0Track9 = interfaceC4353pt2.track(r0.c, i7);
                                                r0.X = interfaceC4326pd0Track9;
                                                interfaceC4326pd0Track9.e(c4619swA9);
                                                sparseArray.put(r0.c, r0);
                                                om = null;
                                            } catch (ArrayIndexOutOfBoundsException unused6) {
                                                exc = null;
                                            }
                                            break;
                                        case 8:
                                            str3 = str3;
                                            byte[] bArr6 = new byte[4];
                                            System.arraycopy(r0.a(r0.b), 0, bArr6, 0, 4);
                                            C3965lY c3965lYP = AC.p(bArr6);
                                            str30 = MimeTypes.APPLICATION_DVBSUBS;
                                            list5 = c3965lYP;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z13 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i215 = (z13 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i215;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA10 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track10 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track10;
                                            interfaceC4326pd0Track10.e(c4619swA10);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 10:
                                            C4464r8 c4464r8A = C4464r8.a(new JT(r0.a(r0.b)));
                                            r0.Y = c4464r8A.b;
                                            str30 = "video/avc";
                                            list3 = c4464r8A.f4918a;
                                            str18 = c4464r8A.f;
                                            i3 = -1;
                                            i4 = -1;
                                            List list6 = list3;
                                            str15 = str18;
                                            list = list6;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z14 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i216 = (z14 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i216;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA11 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track11 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track11;
                                            interfaceC4326pd0Track11.e(c4619swA11);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 11:
                                            str3 = str3;
                                            C3965lY c3965lYP2 = AC.p(r0.a(r0.b));
                                            str30 = MimeTypes.APPLICATION_VOBSUB;
                                            list5 = c3965lYP2;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z15 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i217 = (z15 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i217;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA12 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track12 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track12;
                                            interfaceC4326pd0Track12.e(c4619swA12);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 12:
                                            str3 = str3;
                                            str30 = MimeTypes.AUDIO_DTS_HD;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z16 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i218 = (z16 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i218;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA13 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track13 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track13;
                                            interfaceC4326pd0Track13.e(c4619swA13);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 13:
                                            List listSingletonList2 = Collections.singletonList(r0.a(r0.b));
                                            C3129c c3129cA0 = AbstractC2845Vx.a0(new Uh0(r0.k, 2, (Object) null), false);
                                            r0.Q = c3129cA0.b;
                                            r0.O = c3129cA0.c;
                                            str17 = MimeTypes.AUDIO_AAC;
                                            str16 = c3129cA0.f4197a;
                                            list2 = listSingletonList2;
                                            i3 = -1;
                                            i4 = -1;
                                            String str32 = str16;
                                            str30 = str17;
                                            str15 = str32;
                                            list = list2;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z17 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i219 = (z17 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i219;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA14 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track14 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track14;
                                            interfaceC4326pd0Track14.e(c4619swA14);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 14:
                                            str3 = str3;
                                            str30 = MimeTypes.AUDIO_AC3;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z18 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2110 = (z18 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2110;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA15 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track15 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track15;
                                            interfaceC4326pd0Track15.e(c4619swA15);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 15:
                                        case 21:
                                            str3 = str3;
                                            str30 = MimeTypes.AUDIO_DTS;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z19 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2111 = (z19 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2111;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA16 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track16 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track16;
                                            interfaceC4326pd0Track16.e(c4619swA16);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 16:
                                            str3 = str3;
                                            str30 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z110 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2112 = (z110 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2112;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA17 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track17 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track17;
                                            interfaceC4326pd0Track17.e(c4619swA17);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 17:
                                            str3 = str3;
                                            str30 = MimeTypes.VIDEO_VP8;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z111 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2113 = (z111 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2113;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA18 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track18 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track18;
                                            interfaceC4326pd0Track18.e(c4619swA18);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 18:
                                            str3 = str3;
                                            str30 = MimeTypes.VIDEO_VP9;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z112 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2114 = (z112 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2114;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA19 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track19 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track19;
                                            interfaceC4326pd0Track19.e(c4619swA19);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 19:
                                            str3 = str3;
                                            str30 = MimeTypes.APPLICATION_PGS;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z113 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2115 = (z113 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2115;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA110 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track110 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track110;
                                            interfaceC4326pd0Track110.e(c4619swA110);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 20:
                                            str3 = str3;
                                            str30 = MimeTypes.VIDEO_UNKNOWN;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z114 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2116 = (z114 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2116;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA111 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track111 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track111;
                                            interfaceC4326pd0Track111.e(c4619swA111);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 22:
                                            str3 = str3;
                                            if (r0.P == 32) {
                                                list4 = null;
                                                str15 = null;
                                                i3 = 4;
                                            } else {
                                                AbstractC4038mJ.f();
                                                str30 = MimeTypes.AUDIO_UNKNOWN;
                                                list5 = null;
                                                str15 = null;
                                                i3 = -1;
                                                list4 = list5;
                                            }
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z115 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2117 = (z115 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2117;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA112 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track112 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track112;
                                            interfaceC4326pd0Track112.e(c4619swA112);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 23:
                                            str3 = str3;
                                            int i42 = r0.P;
                                            if (i42 == 8) {
                                                list4 = null;
                                                str15 = null;
                                                i3 = 3;
                                            } else if (i42 == 16) {
                                                list4 = null;
                                                str15 = null;
                                                i3 = 268435456;
                                            } else {
                                                AbstractC4038mJ.f();
                                                str30 = MimeTypes.AUDIO_UNKNOWN;
                                                list5 = null;
                                                str15 = null;
                                                i3 = -1;
                                                list4 = list5;
                                            }
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z116 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2118 = (z116 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2118;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA113 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track113 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track113;
                                            interfaceC4326pd0Track113.e(c4619swA113);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 24:
                                            str3 = str3;
                                            iY = Ug0.y(r0.P);
                                            if (iY == 0) {
                                                AbstractC4038mJ.f();
                                                str30 = MimeTypes.AUDIO_UNKNOWN;
                                                list5 = null;
                                                str15 = null;
                                                i3 = -1;
                                                list4 = list5;
                                            } else {
                                                i3 = iY;
                                                list4 = null;
                                                str15 = null;
                                            }
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z117 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i2119 = (z117 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i2119;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA114 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track114 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track114;
                                            interfaceC4326pd0Track114.e(c4619swA114);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 25:
                                            str3 = str3;
                                            C3965lY c3965lYQ = AC.q(d0, r0.a(r0.b));
                                            str30 = MimeTypes.TEXT_SSA;
                                            list5 = c3965lYQ;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z118 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21110 = (z118 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21110;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA115 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track115 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track115;
                                            interfaceC4326pd0Track115.e(c4619swA115);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 26:
                                            C4464r8 c4464r8B = C4464r8.b(new JT(r0.a(r0.b)));
                                            r0.Y = c4464r8B.b;
                                            str30 = "video/hevc";
                                            list3 = c4464r8B.f4918a;
                                            str18 = c4464r8B.f;
                                            i3 = -1;
                                            i4 = -1;
                                            List list7 = list3;
                                            str15 = str18;
                                            list = list7;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z119 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21111 = (z119 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21111;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA116 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track116 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track116;
                                            interfaceC4326pd0Track116.e(c4619swA116);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 27:
                                            str3 = str3;
                                            str30 = MimeTypes.TEXT_VTT;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1110 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21112 = (z1110 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21112;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA117 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track117 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track117;
                                            interfaceC4326pd0Track117.e(c4619swA117);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 28:
                                            str3 = str3;
                                            str30 = MimeTypes.APPLICATION_SUBRIP;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1111 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21113 = (z1111 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21113;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA118 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track118 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track118;
                                            interfaceC4326pd0Track118.e(c4619swA118);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 29:
                                            str3 = str3;
                                            str30 = MimeTypes.VIDEO_MPEG2;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1112 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21114 = (z1112 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21114;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA119 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track119 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track119;
                                            interfaceC4326pd0Track119.e(c4619swA119);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 30:
                                            str3 = str3;
                                            str30 = MimeTypes.AUDIO_E_AC3;
                                            list5 = null;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1113 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21115 = (z1113 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21115;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA1110 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track1110 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track1110;
                                            interfaceC4326pd0Track1110.e(c4619swA1110);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 31:
                                            str3 = str3;
                                            List listSingletonList3 = Collections.singletonList(r0.a(r0.b));
                                            str30 = MimeTypes.AUDIO_FLAC;
                                            list5 = listSingletonList3;
                                            str15 = null;
                                            i3 = -1;
                                            list4 = list5;
                                            i4 = -1;
                                            list = list4;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1114 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21116 = (z1114 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21116;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA1111 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track1111 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track1111;
                                            interfaceC4326pd0Track1111.e(c4619swA1111);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        case 32:
                                            ArrayList arrayList2 = new ArrayList(3);
                                            arrayList2.add(r0.a(r0.b));
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                            str3 = str3;
                                            arrayList2.add(byteBufferAllocate.order(byteOrder).putLong(r0.R).array());
                                            arrayList2.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r0.S).array());
                                            str30 = MimeTypes.AUDIO_OPUS;
                                            str15 = null;
                                            i3 = -1;
                                            i4 = 5760;
                                            list = arrayList2;
                                            if (r0.N != null) {
                                                str15 = c3129cA.f4197a;
                                                str30 = "video/dolby-vision";
                                            }
                                            boolean z1115 = r0.V;
                                            if (r0.U) {
                                                i6 = 2;
                                            } else {
                                                i6 = 0;
                                            }
                                            int i21117 = (z1115 ? 1 : 0) | i6;
                                            c4531rw = new C4531rw();
                                            if (AbstractC5011xP.k(str30)) {
                                                c4531rw.x = r0.O;
                                                c4531rw.y = r0.Q;
                                                c4531rw.z = i3;
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                i7 = 1;
                                            } else if (AbstractC5011xP.m(str30)) {
                                                if (r0.q == 0) {
                                                    i11 = r0.o;
                                                    i8 = -1;
                                                    if (i11 == -1) {
                                                        i11 = r0.m;
                                                    }
                                                    r0.o = i11;
                                                    i12 = r0.p;
                                                    if (i12 == -1) {
                                                        i12 = r0.n;
                                                    }
                                                    r0.p = i12;
                                                } else {
                                                    i8 = -1;
                                                }
                                                i9 = r0.o;
                                                if (i9 != i8) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (r0.x) {
                                                    if (r0.D == -1.0f) {
                                                    }
                                                    c2879Xf = new C2879Xf(r0.y, r0.A, r0.z, bArr);
                                                } else {
                                                    str = str;
                                                    c2879Xf = null;
                                                }
                                                str19 = r0.f3501a;
                                                if (str19 != null) {
                                                    map = h0;
                                                    if (map.containsKey(str19)) {
                                                        iIntValue = ((Integer) map.get(r0.f3501a)).intValue();
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (r0.r == 0) {
                                                    if (Float.compare(r0.u, 0.0f) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(r0.t, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                c4531rw.p = r0.m;
                                                c4531rw.q = r0.n;
                                                c4531rw.t = f;
                                                c4531rw.s = iIntValue;
                                                c4531rw.u = r0.v;
                                                c4531rw.v = r0.w;
                                                c4531rw.w = c2879Xf;
                                                i7 = 2;
                                            } else {
                                                str = str;
                                                str5 = str5;
                                                str2 = str2;
                                                if (MimeTypes.APPLICATION_SUBRIP.equals(str30)) {
                                                }
                                                i7 = 3;
                                            }
                                            str20 = r0.f3501a;
                                            if (str20 != null) {
                                                c4531rw.b = r0.f3501a;
                                            }
                                            c4531rw.f4954a = Integer.toString(i25);
                                            c4531rw.k = str30;
                                            c4531rw.l = i4;
                                            c4531rw.c = r0.W;
                                            c4531rw.d = i21117;
                                            c4531rw.m = list;
                                            c4531rw.h = str15;
                                            c4531rw.n = r0.l;
                                            C4619sw c4619swA1112 = c4531rw.a();
                                            InterfaceC4326pd0 interfaceC4326pd0Track1112 = interfaceC4353pt2.track(r0.c, i7);
                                            r0.X = interfaceC4326pd0Track1112;
                                            interfaceC4326pd0Track1112.e(c4619swA1112);
                                            sparseArray.put(r0.c, r0);
                                            om = null;
                                            break;
                                        default:
                                            throw KT.a("Unrecognized codec identifier.", null);
                                    }
                                    break;
                                default:
                                    str2 = str2;
                                    str9 = str8;
                                    om = null;
                                    str = str;
                                    break;
                            }
                            pm3.u = om;
                            str6 = str9;
                        }
                        r4 = interfaceC4265ot;
                        z = false;
                    }
                    z3 = true;
                    r3 = r4;
                } else {
                    str = str26;
                }
                str4 = str23;
                str3 = str24;
                str6 = str25;
                str2 = str27;
                ?? r2 = 0;
                str5 = str21;
                if (r8.e == 0) {
                    ?? r6 = interfaceC4265ot;
                    int i43 = 4;
                    long jC = r8.c.c(r6, true, false, 4);
                    if (jC == -2) {
                        interfaceC4265ot.resetPeekPosition();
                        while (true) {
                            byte[] bArr7 = r8.f3938a;
                            r6.peekFully(bArr7, r2, i43);
                            iB = C3456fh0.b(bArr7[r2]);
                            if (iB != -1 && iB <= i43) {
                                iA = (int) C3456fh0.a(bArr7, iB, r2);
                                ((PM) r8.d.b).getClass();
                                if (iA == 357149030 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                                }
                            }
                            r6.skipFully(1);
                            r2 = 0;
                            i43 = 4;
                        }
                        r6.skipFully(iB);
                        j = iA;
                        z2 = true;
                    } else {
                        z2 = true;
                        j = jC;
                    }
                    if (j == -1) {
                        z = false;
                        z3 = false;
                        r3 = r6;
                    } else {
                        r8.f = (int) j;
                        r8.e = z2 ? 1 : 0;
                        r5 = r6;
                    }
                } else {
                    r5 = interfaceC4265ot;
                    z2 = true;
                }
                if (r8.e == z2) {
                    r8.g = r8.c.c(r5, false, z2, 8);
                    r8.e = 2;
                }
                NN nn2 = r8.d;
                int i44 = r8.f;
                ((PM) nn2.b).getClass();
                switch (i44) {
                    case 131:
                    case 136:
                    case Input.Keys.NUMPAD_MULTIPLY /* 155 */:
                    case Input.Keys.NUMPAD_COMMA /* 159 */:
                    case 176:
                    case 179:
                    case Input.Keys.F16 /* 186 */:
                    case AD_RESPONSE_EMPTY_VALUE:
                    case 231:
                    case 238:
                    case 241:
                    case 251:
                    case 16871:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30114:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i = 3;
                        break;
                    case Input.Keys.NUMPAD_ENTER /* 160 */:
                    case 166:
                    case 174:
                    case Input.Keys.F13 /* 183 */:
                    case Input.Keys.F17 /* 187 */:
                    case 224:
                    case 225:
                    case 16868:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i = 1;
                        break;
                    case Input.Keys.NUMPAD_EQUALS /* 161 */:
                    case Input.Keys.NUMPAD_RIGHT_PAREN /* 163 */:
                    case 165:
                    case 16877:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i = 5;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i != 0) {
                    if (i == 1) {
                        long position = interfaceC4265ot.getPosition();
                        arrayDeque.push(new C2834Vm(r8.f, position + r8.g));
                        r8.d.x(r8.f, position, r8.g);
                        z = false;
                        r8.e = 0;
                        r4 = r5;
                    } else if (i == 2) {
                        long j6 = r8.g;
                        if (j6 > 8) {
                            throw KT.a("Invalid integer size: " + r8.g, null);
                        }
                        r8.d.r(r8.f, r8.a(r5, (int) j6));
                        z = false;
                        r8.e = 0;
                        r4 = r5;
                    } else if (i == 3) {
                        long j7 = r8.g;
                        if (j7 > 2147483647L) {
                            throw KT.a("String element size: " + r8.g, null);
                        }
                        NN nn3 = r8.d;
                        int i45 = r8.f;
                        int i46 = (int) j7;
                        if (i46 == 0) {
                            str7 = "";
                            i2 = 0;
                        } else {
                            byte[] bArr8 = new byte[i46];
                            i2 = 0;
                            r5.readFully(bArr8, 0, i46);
                            while (i46 > 0 && bArr8[i46 - 1] == 0) {
                                i46--;
                            }
                            str7 = new String(bArr8, 0, i46);
                        }
                        nn3.y(i45, str7);
                        r8.e = i2;
                        z = false;
                        r4 = r5;
                    } else if (i == 4) {
                        r8.d.h(r8.f, (int) r8.g, r5);
                        z = false;
                        r8.e = 0;
                        r4 = r5;
                    } else {
                        if (i != 5) {
                            throw KT.a("Invalid element type " + i, null);
                        }
                        long j8 = r8.g;
                        if (j8 != 4 && j8 != 8) {
                            throw KT.a("Invalid float size: " + r8.g, null);
                        }
                        NN nn4 = r8.d;
                        int i47 = r8.f;
                        int i48 = (int) j8;
                        long jA = r8.a(r5, i48);
                        nn4.l(i47, i48 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA));
                        z = false;
                        r8.e = 0;
                        r4 = r5;
                    }
                    z3 = true;
                    r3 = r4;
                } else {
                    r5.skipFully((int) r8.g);
                    r8.e = 0;
                    str25 = str6;
                    str21 = str5;
                    str26 = str;
                    str23 = str4;
                    str24 = str3;
                    str22 = str2;
                }
            }
            if (z3) {
                long position2 = interfaceC4265ot.getPosition();
                pm = this;
                if (pm.y) {
                    pm.A = position2;
                    c2868Wu.b = pm.z;
                    pm.y = z;
                    return 1;
                }
                c2868Wu2 = c2868Wu;
                if (pm.v) {
                    long j9 = pm.A;
                    if (j9 != -1) {
                        c2868Wu2.b = j9;
                        pm.A = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            } else {
                pm = this;
                c2868Wu2 = c2868Wu;
            }
            str25 = str6;
            pm2 = pm;
            str21 = str5;
            str26 = str;
            str23 = str4;
            str24 = str3;
            str22 = str2;
        }
        PM pm4 = pm2;
        if (z3) {
            return 0;
        }
        for (int i49 = 0; i49 < pm4.c.size(); i49++) {
            OM om6 = (OM) pm4.c.valueAt(i49);
            om6.X.getClass();
            C3626he0 c3626he0 = om6.T;
            if (c3626he0 != null) {
                c3626he0.a(om6.X, om6.j);
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        C2329Ca c2329Ca = new C2329Ca(1);
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        long j = c2938Zm.c;
        long j2 = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if (j != -1 && j <= PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            j2 = j;
        }
        int i = (int) j2;
        c2938Zm.peekFully(((JT) c2329Ca.b).f3266a, 0, 4, false);
        c2329Ca.f2927a = 4;
        for (long jU = ((JT) c2329Ca.b).u(); jU != 440786851; jU = ((jU << 8) & (-256)) | ((long) (((JT) c2329Ca.b).f3266a[0] & 255))) {
            int i2 = c2329Ca.f2927a + 1;
            c2329Ca.f2927a = i2;
            if (i2 == i) {
                return false;
            }
            c2938Zm.peekFully(((JT) c2329Ca.b).f3266a, 0, 1, false);
        }
        long jH = c2329Ca.h(c2938Zm);
        long j3 = c2329Ca.f2927a;
        if (jH == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jH >= j) {
            return false;
        }
        while (true) {
            long j4 = c2329Ca.f2927a;
            long j5 = j3 + jH;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (c2329Ca.h(c2938Zm) == Long.MIN_VALUE) {
                return false;
            }
            long jH2 = c2329Ca.h(c2938Zm);
            if (jH2 < 0 || jH2 > 2147483647L) {
                return false;
            }
            if (jH2 != 0) {
                int i3 = (int) jH2;
                c2938Zm.advancePeekPosition(i3, false);
                c2329Ca.f2927a += i3;
            }
        }
    }

    public final void c(int i) {
        if (this.C == null || this.D == null) {
            throw KT.a("Element " + i + " must be in a Cues", null);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.b0 = interfaceC4353pt;
    }

    public final void e(int i) {
        if (this.u != null) {
            return;
        }
        throw KT.a("Element " + i + " must be in a TrackEntry", null);
    }

    public final void f(OM om, long j, int i, int i2, int i3) {
        byte[] bArrG;
        int i4;
        int i5;
        C3626he0 c3626he0 = om.T;
        if (c3626he0 != null) {
            c3626he0.b(om.X, j, i, i2, i3, om.j);
        } else {
            if ("S_TEXT/UTF8".equals(om.b) || "S_TEXT/ASS".equals(om.b) || "S_TEXT/WEBVTT".equals(om.b)) {
                if (this.K > 1) {
                    AbstractC4038mJ.f();
                } else {
                    long j2 = this.I;
                    if (j2 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        AbstractC4038mJ.f();
                    } else {
                        String str = om.b;
                        JT jt = this.k;
                        byte[] bArr = jt.f3266a;
                        str.getClass();
                        int iHashCode = str.hashCode();
                        byte b = -1;
                        if (iHashCode != 738597099) {
                            if (iHashCode != 1045209816) {
                                if (iHashCode == 1422270023 && str.equals("S_TEXT/UTF8")) {
                                    b = 2;
                                }
                            } else if (str.equals("S_TEXT/WEBVTT")) {
                                b = 1;
                            }
                        } else if (str.equals("S_TEXT/ASS")) {
                            b = 0;
                        }
                        if (b == 0) {
                            bArrG = g(j2, WorkRequest.MIN_BACKOFF_MILLIS, "%01d:%02d:%02d:%02d");
                            i4 = 21;
                        } else if (b == 1) {
                            bArrG = g(j2, 1000L, "%02d:%02d:%02d.%03d");
                            i4 = 25;
                        } else {
                            if (b != 2) {
                                throw new IllegalArgumentException();
                            }
                            bArrG = g(j2, 1000L, "%02d:%02d:%02d,%03d");
                            i4 = 19;
                        }
                        System.arraycopy(bArrG, 0, bArr, i4, bArrG.length);
                        for (int i6 = jt.b; i6 < jt.c; i6++) {
                            if (jt.f3266a[i6] == 0) {
                                jt.D(i6);
                                break;
                            }
                        }
                        om.X.d(jt.c, jt);
                        i5 = i2 + jt.c;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((i & 268435456) != 0) {
                int i7 = this.K;
                JT jt2 = this.n;
                if (i7 > 1) {
                    jt2.B(0);
                } else {
                    int i8 = jt2.c;
                    om.X.b(i8, jt2);
                    i5 += i8;
                }
            }
            om.X.a(j, i, i5, i3, om.j);
        }
        this.F = true;
    }

    public final void h(InterfaceC4265ot interfaceC4265ot, int i) {
        JT jt = this.g;
        if (jt.c >= i) {
            return;
        }
        byte[] bArr = jt.f3266a;
        if (bArr.length < i) {
            jt.b(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = jt.f3266a;
        int i2 = jt.c;
        interfaceC4265ot.readFully(bArr2, i2, i - i2);
        jt.D(i);
    }

    public final void i() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.B(0);
    }

    public final long j(long j) throws KT {
        long j2 = this.r;
        if (j2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            return Ug0.R(j, j2, 1000L);
        }
        throw KT.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int k(InterfaceC4265ot interfaceC4265ot, OM om, int i, boolean z) {
        int iC;
        int iC2;
        int i2;
        if ("S_TEXT/UTF8".equals(om.b)) {
            l(interfaceC4265ot, c0, i);
            int i3 = this.T;
            i();
            return i3;
        }
        if ("S_TEXT/ASS".equals(om.b)) {
            l(interfaceC4265ot, e0, i);
            int i4 = this.T;
            i();
            return i4;
        }
        if ("S_TEXT/WEBVTT".equals(om.b)) {
            l(interfaceC4265ot, f0, i);
            int i5 = this.T;
            i();
            return i5;
        }
        InterfaceC4326pd0 interfaceC4326pd0 = om.X;
        boolean z2 = this.V;
        JT jt = this.j;
        if (!z2) {
            boolean z3 = om.h;
            JT jt2 = this.g;
            if (z3) {
                this.O &= -1073741825;
                if (!this.W) {
                    interfaceC4265ot.readFully(jt2.f3266a, 0, 1);
                    this.S++;
                    byte b = jt2.f3266a[0];
                    if ((b & 128) == 128) {
                        throw KT.a("Extension bit is set in signal byte", null);
                    }
                    this.Z = b;
                    this.W = true;
                }
                byte b2 = this.Z;
                if ((b2 & 1) == 1) {
                    boolean z4 = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.a0) {
                        JT jt3 = this.l;
                        interfaceC4265ot.readFully(jt3.f3266a, 0, 8);
                        this.S += 8;
                        this.a0 = true;
                        jt2.f3266a[0] = (byte) ((z4 ? 128 : 0) | 8);
                        jt2.E(0);
                        interfaceC4326pd0.b(1, jt2);
                        this.T++;
                        jt3.E(0);
                        interfaceC4326pd0.b(8, jt3);
                        this.T += 8;
                    }
                    if (z4) {
                        if (!this.X) {
                            interfaceC4265ot.readFully(jt2.f3266a, 0, 1);
                            this.S++;
                            jt2.E(0);
                            this.Y = jt2.t();
                            this.X = true;
                        }
                        int i6 = this.Y * 4;
                        jt2.B(i6);
                        interfaceC4265ot.readFully(jt2.f3266a, 0, i6);
                        this.S += i6;
                        short s = (short) ((this.Y / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.o = ByteBuffer.allocate(i7);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i2 = this.Y;
                            if (i8 >= i2) {
                                break;
                            }
                            int iW = jt2.w();
                            if (i8 % 2 == 0) {
                                this.o.putShort((short) (iW - i9));
                            } else {
                                this.o.putInt(iW - i9);
                            }
                            i8++;
                            i9 = iW;
                        }
                        int i10 = (i - this.S) - i9;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i10);
                        } else {
                            this.o.putShort((short) i10);
                            this.o.putInt(0);
                        }
                        byte[] bArrArray = this.o.array();
                        JT jt4 = this.m;
                        jt4.C(bArrArray, i7);
                        interfaceC4326pd0.b(i7, jt4);
                        this.T += i7;
                    }
                }
            } else {
                byte[] bArr = om.i;
                if (bArr != null) {
                    jt.C(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(om.b) ? om.f > 0 : z) {
                this.O |= 268435456;
                this.n.B(0);
                int i11 = (jt.c + i) - this.S;
                jt2.B(4);
                byte[] bArr2 = jt2.f3266a;
                bArr2[0] = (byte) ((i11 >> 24) & 255);
                bArr2[1] = (byte) ((i11 >> 16) & 255);
                bArr2[2] = (byte) ((i11 >> 8) & 255);
                bArr2[3] = (byte) (i11 & 255);
                interfaceC4326pd0.b(4, jt2);
                this.T += 4;
            }
            this.V = true;
        }
        int i12 = i + jt.c;
        if (!"V_MPEG4/ISO/AVC".equals(om.b) && !"V_MPEGH/ISO/HEVC".equals(om.b)) {
            if (om.T != null) {
                FW.s(jt.c == 0);
                om.T.c(interfaceC4265ot);
            }
            while (true) {
                int i13 = this.S;
                if (i13 >= i12) {
                    break;
                }
                int i14 = i12 - i13;
                int iA = jt.a();
                if (iA > 0) {
                    iC2 = Math.min(i14, iA);
                    interfaceC4326pd0.d(iC2, jt);
                } else {
                    iC2 = interfaceC4326pd0.c(interfaceC4265ot, i14, false);
                }
                this.S += iC2;
                this.T += iC2;
            }
        } else {
            JT jt5 = this.f;
            byte[] bArr3 = jt5.f3266a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i15 = om.Y;
            int i16 = 4 - i15;
            while (this.S < i12) {
                int i17 = this.U;
                if (i17 == 0) {
                    int iMin = Math.min(i15, jt.a());
                    interfaceC4265ot.readFully(bArr3, i16 + iMin, i15 - iMin);
                    if (iMin > 0) {
                        jt.d(bArr3, i16, iMin);
                    }
                    this.S += i15;
                    jt5.E(0);
                    this.U = jt5.w();
                    JT jt6 = this.e;
                    jt6.E(0);
                    interfaceC4326pd0.d(4, jt6);
                    this.T += 4;
                } else {
                    int iA2 = jt.a();
                    if (iA2 > 0) {
                        iC = Math.min(i17, iA2);
                        interfaceC4326pd0.d(iC, jt);
                    } else {
                        iC = interfaceC4326pd0.c(interfaceC4265ot, i17, false);
                    }
                    this.S += iC;
                    this.T += iC;
                    this.U -= iC;
                }
            }
        }
        if ("A_VORBIS".equals(om.b)) {
            JT jt7 = this.h;
            jt7.E(0);
            interfaceC4326pd0.d(4, jt7);
            this.T += 4;
        }
        int i18 = this.T;
        i();
        return i18;
    }

    public final void l(InterfaceC4265ot interfaceC4265ot, byte[] bArr, int i) {
        int length = bArr.length + i;
        JT jt = this.k;
        byte[] bArr2 = jt.f3266a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            jt.C(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        interfaceC4265ot.readFully(jt.f3266a, bArr.length, i);
        jt.E(0);
        jt.D(length);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.B = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.G = 0;
        C2860Wm c2860Wm = this.f3548a;
        c2860Wm.e = 0;
        c2860Wm.b.clear();
        C3456fh0 c3456fh0 = c2860Wm.c;
        c3456fh0.b = 0;
        c3456fh0.c = 0;
        C3456fh0 c3456fh1 = this.b;
        c3456fh1.b = 0;
        c3456fh1.c = 0;
        i();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            C3626he0 c3626he0 = ((OM) sparseArray.valueAt(i)).T;
            if (c3626he0 != null) {
                c3626he0.b = false;
                c3626he0.c = 0;
            }
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
