package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class re0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f19567a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f19568b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f19569c = Pattern.compile("^\\D?(\\d+)$");

    public static String a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        int i14;
        Object[] objArr = {f19568b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? 'L' : 'H'), Integer.valueOf(i13)};
        String str = uu0.f20901a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i15 = 6;
        while (true) {
            if (i15 <= 0) {
                break;
            }
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (i14 = 0; i14 < i15; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static Pair b(g22 g22Var) {
        boolean z10;
        he0 he0VarC = c(g22Var);
        if (he0VarC == null || !(z10 = he0VarC.f15268b)) {
            return null;
        }
        ps1.c0(z10);
        Integer numValueOf = Integer.valueOf(he0VarC.f15267a);
        ps1.c0(z10);
        return new Pair(numValueOf, Integer.valueOf(he0VarC.f15269c));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0204  */
    /* JADX WARN: Code duplicated, block: B:113:0x0209  */
    /* JADX WARN: Code duplicated, block: B:115:0x020d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0221  */
    /* JADX WARN: Code duplicated, block: B:126:0x0229  */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0230  */
    /* JADX WARN: Code duplicated, block: B:133:0x023c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0244  */
    /* JADX WARN: Code duplicated, block: B:136:0x024c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0254  */
    /* JADX WARN: Code duplicated, block: B:139:0x025c  */
    /* JADX WARN: Code duplicated, block: B:141:0x0264  */
    /* JADX WARN: Code duplicated, block: B:142:0x026c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0274  */
    /* JADX WARN: Code duplicated, block: B:145:0x027c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0284  */
    /* JADX WARN: Code duplicated, block: B:148:0x028c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0294  */
    /* JADX WARN: Code duplicated, block: B:151:0x029c  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:159:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:160:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:162:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:163:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:165:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x02da  */
    /* JADX WARN: Code duplicated, block: B:168:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:169:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:175:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:177:0x0306  */
    /* JADX WARN: Code duplicated, block: B:178:0x030a  */
    /* JADX WARN: Code duplicated, block: B:180:0x0312  */
    /* JADX WARN: Code duplicated, block: B:181:0x0315  */
    /* JADX WARN: Code duplicated, block: B:183:0x031d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0320  */
    /* JADX WARN: Code duplicated, block: B:186:0x0328  */
    /* JADX WARN: Code duplicated, block: B:187:0x032d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0335  */
    /* JADX WARN: Code duplicated, block: B:190:0x033a  */
    /* JADX WARN: Code duplicated, block: B:192:0x0342  */
    /* JADX WARN: Code duplicated, block: B:193:0x0344  */
    /* JADX WARN: Code duplicated, block: B:195:0x034c  */
    /* JADX WARN: Code duplicated, block: B:196:0x034e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0356  */
    /* JADX WARN: Code duplicated, block: B:199:0x0358  */
    /* JADX WARN: Code duplicated, block: B:201:0x0360  */
    /* JADX WARN: Code duplicated, block: B:202:0x0362  */
    /* JADX WARN: Code duplicated, block: B:204:0x0366  */
    /* JADX WARN: Code duplicated, block: B:206:0x0370  */
    /* JADX WARN: Code duplicated, block: B:208:0x037b  */
    /* JADX WARN: Code duplicated, block: B:423:0x064a  */
    /* JADX WARN: Code duplicated, block: B:445:0x06a3 A[PHI: r4
  0x06a3: PHI (r4v45 int) = (r4v44 int), (r4v63 int) binds: [B:444:0x06a1, B:441:0x0696] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:447:0x06a9  */
    /* JADX WARN: Code duplicated, block: B:449:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:452:0x06b7 A[Catch: NumberFormatException -> 0x079f, TryCatch #7 {NumberFormatException -> 0x079f, blocks: (B:450:0x06af, B:452:0x06b7, B:455:0x06d4, B:507:0x0782), top: B:808:0x06af }] */
    /* JADX WARN: Code duplicated, block: B:453:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:455:0x06d4 A[Catch: NumberFormatException -> 0x079f, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x079f, blocks: (B:450:0x06af, B:452:0x06b7, B:455:0x06d4, B:507:0x0782), top: B:808:0x06af }] */
    /* JADX WARN: Code duplicated, block: B:458:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:460:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:462:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:464:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:468:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:470:0x0700  */
    /* JADX WARN: Code duplicated, block: B:471:0x0702  */
    /* JADX WARN: Code duplicated, block: B:472:0x0705  */
    /* JADX WARN: Code duplicated, block: B:473:0x0707  */
    /* JADX WARN: Code duplicated, block: B:474:0x0709  */
    /* JADX WARN: Code duplicated, block: B:475:0x070c  */
    /* JADX WARN: Code duplicated, block: B:476:0x070e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0710  */
    /* JADX WARN: Code duplicated, block: B:479:0x0713  */
    /* JADX WARN: Code duplicated, block: B:481:0x072a  */
    /* JADX WARN: Code duplicated, block: B:482:0x072d  */
    /* JADX WARN: Code duplicated, block: B:483:0x0730  */
    /* JADX WARN: Code duplicated, block: B:484:0x0733  */
    /* JADX WARN: Code duplicated, block: B:485:0x0736  */
    /* JADX WARN: Code duplicated, block: B:486:0x0739  */
    /* JADX WARN: Code duplicated, block: B:487:0x073b  */
    /* JADX WARN: Code duplicated, block: B:488:0x073e  */
    /* JADX WARN: Code duplicated, block: B:489:0x0741  */
    /* JADX WARN: Code duplicated, block: B:490:0x0744  */
    /* JADX WARN: Code duplicated, block: B:491:0x0747  */
    /* JADX WARN: Code duplicated, block: B:492:0x074a  */
    /* JADX WARN: Code duplicated, block: B:493:0x074d  */
    /* JADX WARN: Code duplicated, block: B:494:0x0750  */
    /* JADX WARN: Code duplicated, block: B:495:0x0753  */
    /* JADX WARN: Code duplicated, block: B:496:0x0756  */
    /* JADX WARN: Code duplicated, block: B:497:0x0759  */
    /* JADX WARN: Code duplicated, block: B:498:0x075c  */
    /* JADX WARN: Code duplicated, block: B:499:0x075e  */
    /* JADX WARN: Code duplicated, block: B:500:0x0761  */
    /* JADX WARN: Code duplicated, block: B:501:0x0763  */
    /* JADX WARN: Code duplicated, block: B:503:0x0766  */
    /* JADX WARN: Code duplicated, block: B:505:0x077b  */
    /* JADX WARN: Code duplicated, block: B:507:0x0782 A[Catch: NumberFormatException -> 0x079f, TRY_ENTER, TRY_LEAVE, TryCatch #7 {NumberFormatException -> 0x079f, blocks: (B:450:0x06af, B:452:0x06b7, B:455:0x06d4, B:507:0x0782), top: B:808:0x06af }] */
    /* JADX WARN: Code duplicated, block: B:760:0x0b57  */
    /* JADX WARN: Code duplicated, block: B:837:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:838:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:839:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:840:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:841:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:842:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:843:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:844:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:845:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:846:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:847:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:848:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:849:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:850:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:851:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:852:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:853:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:854:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:855:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:856:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:857:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:858:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:859:? A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x067e, code lost:
    
        if (r2.equals("hvc1") != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0687, code lost:
    
        if (r2.equals("hev1") != false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x068d, code lost:
    
        return d(r13, r5, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
    
        if (r0.equals("09") != true) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0174, code lost:
    
        if (r0.equals("08") != true) goto L829;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
    
        if (r0.equals("07") != true) goto L830;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0184, code lost:
    
        if (r0.equals("06") != true) goto L831;
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:836:?, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018d, code lost:
    
        if (r0.equals("05") != true) goto L832;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0198, code lost:
    
        if (r0.equals("04") != true) goto L833;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a3, code lost:
    
        if (r0.equals("03") != true) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        if (r0.equals("02") != true) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
    
        if (r0.equals("01") != true) goto L836;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v109 int, still in use, count: 1, list:
  (r1v109 int) from 0x00ac: IF  (r1v109 int) != (1567 int)  -> B:17:0x00ae A[HIDDEN] (LINE:173)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v109 int, still in use, count: 1, list:
  (r1v109 int) from 0x00ac: IF  (r1v109 int) != (1567 int)  -> B:17:0x00ae A[HIDDEN] (LINE:173)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.he0 c(com.google.android.gms.internal.ads.g22 r35) {
        /*
            Method dump skipped, instruction units count: 3464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.re0.c(com.google.android.gms.internal.ads.g22):com.google.android.gms.internal.ads.he0");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static he0 d(String str, String[] strArr, lq1 lq1Var) {
        int i10;
        Integer numValueOf = null;
        if (strArr.length < 4) {
            com.applovin.impl.ca.q(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f19569c.matcher(strArr[1]);
        if (!matcher.matches()) {
            com.applovin.impl.ca.q(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        boolean zEquals = "1".equals(strGroup);
        he0 he0Var = he0.f15266d;
        if (zEquals) {
            i10 = 1;
        } else {
            if (!"2".equals(strGroup)) {
                com.applovin.impl.ca.q(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return he0Var;
            }
            i10 = (lq1Var == null || lq1Var.f17104c != 6) ? 2 : 4096;
        }
        String str2 = strArr[3];
        switch (str2.hashCode()) {
            case 70821:
                if (str2.equals("H30")) {
                    numValueOf = 2;
                }
                break;
            case 70914:
                if (str2.equals("H60")) {
                    numValueOf = 8;
                }
                break;
            case 70917:
                if (str2.equals("H63")) {
                    numValueOf = 32;
                }
                break;
            case 71007:
                if (str2.equals("H90")) {
                    numValueOf = 128;
                }
                break;
            case 71010:
                if (str2.equals("H93")) {
                    numValueOf = 512;
                }
                break;
            case 74665:
                if (str2.equals("L30")) {
                    numValueOf = 1;
                }
                break;
            case 74758:
                if (str2.equals("L60")) {
                    numValueOf = 4;
                }
                break;
            case 74761:
                if (str2.equals("L63")) {
                    numValueOf = 16;
                }
                break;
            case 74851:
                if (str2.equals("L90")) {
                    numValueOf = 64;
                }
                break;
            case 74854:
                if (str2.equals("L93")) {
                    numValueOf = Integer.valueOf(NotificationCompat.FLAG_LOCAL_ONLY);
                }
                break;
            case 2193639:
                if (str2.equals("H120")) {
                    numValueOf = Integer.valueOf(com.ironsource.mediationsdk.metadata.a.f29616n);
                }
                break;
            case 2193642:
                if (str2.equals("H123")) {
                    numValueOf = Integer.valueOf(Segment.SIZE);
                }
                break;
            case 2193732:
                if (str2.equals("H150")) {
                    numValueOf = 32768;
                }
                break;
            case 2193735:
                if (str2.equals("H153")) {
                    numValueOf = 131072;
                }
                break;
            case 2193738:
                if (str2.equals("H156")) {
                    numValueOf = 524288;
                }
                break;
            case 2193825:
                if (str2.equals("H180")) {
                    numValueOf = 2097152;
                }
                break;
            case 2193828:
                if (str2.equals("H183")) {
                    numValueOf = 8388608;
                }
                break;
            case 2193831:
                if (str2.equals("H186")) {
                    numValueOf = 33554432;
                }
                break;
            case 2312803:
                if (str2.equals("L120")) {
                    numValueOf = 1024;
                }
                break;
            case 2312806:
                if (str2.equals("L123")) {
                    numValueOf = 4096;
                }
                break;
            case 2312896:
                if (str2.equals("L150")) {
                    numValueOf = Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE);
                }
                break;
            case 2312899:
                if (str2.equals("L153")) {
                    numValueOf = Integer.valueOf(C.DEFAULT_BUFFER_SEGMENT_SIZE);
                }
                break;
            case 2312902:
                if (str2.equals("L156")) {
                    numValueOf = 262144;
                }
                break;
            case 2312989:
                if (str2.equals("L180")) {
                    numValueOf = Integer.valueOf(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                }
                break;
            case 2312992:
                if (str2.equals("L183")) {
                    numValueOf = 4194304;
                }
                break;
            case 2312995:
                if (str2.equals("L186")) {
                    numValueOf = 16777216;
                }
                break;
        }
        if (numValueOf != null) {
            return new he0(i10, numValueOf.intValue(), true);
        }
        v71.y("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(str2));
        return he0Var;
    }
}
