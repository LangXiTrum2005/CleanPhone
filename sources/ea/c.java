package ea;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.internal.measurement.fa;
import com.google.android.gms.internal.measurement.ga;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.ia;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.ma;
import com.google.android.gms.internal.measurement.n9;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.t9;
import com.google.android.gms.internal.measurement.v9;
import com.mbridge.msdk.MBridgeConstans;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends z3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public HashSet f39265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x.e f39266f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f39267g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f39268h;

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #10 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:483:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x045f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0470  */
    /* JADX WARN: Code duplicated, block: B:196:0x0490  */
    /* JADX WARN: Code duplicated, block: B:202:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:207:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:211:0x04da  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:223:0x0527  */
    /* JADX WARN: Code duplicated, block: B:226:0x0530  */
    /* JADX WARN: Code duplicated, block: B:228:0x053c  */
    /* JADX WARN: Code duplicated, block: B:230:0x055e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0562  */
    /* JADX WARN: Code duplicated, block: B:236:0x057b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x059a  */
    /* JADX WARN: Code duplicated, block: B:249:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:252:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:262:0x061d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0631  */
    /* JADX WARN: Code duplicated, block: B:271:0x0664  */
    /* JADX WARN: Code duplicated, block: B:275:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:282:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:299:0x0709 A[LOOP:3: B:276:0x06a7->B:299:0x0709, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x070c  */
    /* JADX WARN: Code duplicated, block: B:315:0x073c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0747  */
    /* JADX WARN: Code duplicated, block: B:322:0x074b  */
    /* JADX WARN: Code duplicated, block: B:326:0x075d  */
    /* JADX WARN: Code duplicated, block: B:332:0x078c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07be  */
    /* JADX WARN: Code duplicated, block: B:339:0x07cf A[LOOP:5: B:330:0x0786->B:339:0x07cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:352:0x080d  */
    /* JADX WARN: Code duplicated, block: B:354:0x0820  */
    /* JADX WARN: Code duplicated, block: B:358:0x085b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0883  */
    /* JADX WARN: Code duplicated, block: B:371:0x0894  */
    /* JADX WARN: Code duplicated, block: B:382:0x08c3 A[LOOP:7: B:359:0x085d->B:382:0x08c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:400:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:404:0x0908  */
    /* JADX WARN: Code duplicated, block: B:406:0x090c  */
    /* JADX WARN: Code duplicated, block: B:410:0x091c  */
    /* JADX WARN: Code duplicated, block: B:414:0x093d  */
    /* JADX WARN: Code duplicated, block: B:417:0x094e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0965  */
    /* JADX WARN: Code duplicated, block: B:421:0x0973  */
    /* JADX WARN: Code duplicated, block: B:423:0x097e  */
    /* JADX WARN: Code duplicated, block: B:425:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:428:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a3a A[PHI: r16 r20 r21
  0x0a3a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]
  0x0a3a: PHI (r20v9 x.i) = (r20v10 x.i), (r2v41 x.i) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]
  0x0a3a: PHI (r21v8 java.util.Iterator) = (r21v9 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a38, B:443:0x0a28] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a63  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:536:0x063f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x062b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x062b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0704 A[EDGE_INSN: B:542:0x0704->B:298:0x0704 BREAK  A[LOOP:3: B:276:0x06a7->B:299:0x0709], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x077b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08be A[EDGE_INSN: B:553:0x08be->B:381:0x08be BREAK  A[LOOP:7: B:359:0x085d->B:382:0x08c3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x092e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a3f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a32 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x0a0a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0abf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x04a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04eb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:481:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:481:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v207 */
    /* JADX WARN: Type inference failed for: r0v31, types: [x.e, x.i] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [x.e, x.i] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [ea.m1] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [ea.m1] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v29 */
    /* JADX WARN: Type inference failed for: r18v30 */
    /* JADX WARN: Type inference failed for: r18v31 */
    /* JADX WARN: Type inference failed for: r18v32 */
    /* JADX WARN: Type inference failed for: r18v34 */
    /* JADX WARN: Type inference failed for: r18v35 */
    /* JADX WARN: Type inference failed for: r18v36 */
    /* JADX WARN: Type inference failed for: r18v37 */
    /* JADX WARN: Type inference failed for: r18v38, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v42 */
    /* JADX WARN: Type inference failed for: r18v43 */
    /* JADX WARN: Type inference failed for: r18v44 */
    /* JADX WARN: Type inference failed for: r18v45 */
    /* JADX WARN: Type inference failed for: r18v46 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r3v69, types: [bo.b] */
    /* JADX WARN: Type inference failed for: r3v83, types: [bo.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList K0(String str, List list, List list2, Long l, Long l10, boolean z10) throws Throwable {
        boolean z11;
        boolean z12;
        String str2;
        Map map;
        Object obj;
        ?? r10;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        m1 m1Var;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        ga gaVar;
        BitSet bitSet;
        BitSet bitSet2;
        x.e eVar;
        ga gaVar2;
        x.e eVar2;
        List<j8> list3;
        long jLongValue;
        Integer numValueOf;
        int i10;
        boolean z13;
        Iterator it;
        ia iaVar;
        Long lValueOf;
        m mVarG0;
        String str6;
        ?? eVar3;
        ?? r11;
        Cursor cursorRawQuery;
        ?? r0;
        x.e eVar4;
        Iterator it2;
        Integer num;
        ga gaVar3;
        List list4;
        ?? r18;
        Iterator it3;
        m1 m1Var2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        m mVarG1;
        m1 m1Var3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        x.i iVar;
        String strW;
        Map map6;
        Iterator it5;
        Iterator it6;
        x.i iVar2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zB;
        x.i iVar3;
        Map map7;
        p8 p8Var;
        Integer numValueOf3;
        b bVar;
        int i11;
        Integer numValueOf4;
        m1 m1Var4;
        String str9;
        x.e eVar5;
        Cursor cursor;
        m1 m1Var5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        bo.l lVar;
        ?? eVar6;
        Iterator it8;
        v9 v9Var;
        v9 v9VarD;
        r rVarQ1;
        long j10;
        String strZ;
        Map map8;
        int iIntValue2;
        Iterator it9;
        boolean zA;
        Map map9;
        bo.l lVar2;
        Integer num3;
        b bVar2;
        int iV;
        o4 o4Var;
        boolean z14;
        String str11;
        x.e eVar7;
        Cursor cursor2;
        String str12;
        Cursor cursor3;
        Cursor cursorQuery3;
        Cursor cursor4;
        Integer numValueOf6;
        List list6;
        List arrayList4;
        x.e eVar8;
        int i12;
        ?? r12;
        Object obj3;
        ?? r13;
        ?? r19;
        ?? r110;
        List arrayList5;
        m1 m1Var6 = (m1) this.f3623a;
        k9.c0.e(str);
        k9.c0.h(list);
        k9.c0.h(list2);
        this.f39264d = str;
        this.f39265e = new HashSet();
        this.f39266f = new x.e();
        this.f39267g = l;
        this.f39268h = l10;
        Iterator it10 = list.iterator();
        while (true) {
            if (!it10.hasNext()) {
                z11 = false;
                break;
            }
            if ("_s".equals(((v9) it10.next()).z())) {
                z11 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.c4.a();
        boolean zR0 = m1Var6.f39585d.R0(this.f39264d, d0.F0);
        com.google.android.gms.internal.measurement.c4.a();
        boolean zR1 = m1Var6.f39585d.R0(this.f39264d, d0.E0);
        e4 e4Var = this.f39807b;
        if (z11) {
            m mVarG2 = e4Var.g0();
            String str13 = this.f39264d;
            mVarG2.H0();
            mVarG2.G0();
            k9.c0.e(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                mVarG2.x1().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e10) {
                ((m1) mVarG2.f3623a).t().K0().d("Error resetting session-scoped event counts. appId", s0.O0(str13), e10);
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objO0 = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zR1 && zR0) {
                        m mVarG3 = e4Var.g0();
                        m1 m1Var7 = (m1) mVarG3.f3623a;
                        String str16 = this.f39264d;
                        k9.c0.e(str16);
                        z12 = z11;
                        x.e eVar9 = new x.e();
                        try {
                            ?? Query = mVarG3.x1().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query.moveToFirst()) {
                                        str2 = "data";
                                        Query = Query;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    j8 j8Var = (j8) ((i8) h4.r1(j8.G(), Query.getBlob(1))).f();
                                                    if (j8Var.A()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query.getInt(0));
                                                        List list7 = (List) eVar9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            eVar9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(j8Var);
                                                        r111 = Query;
                                                    } else {
                                                        r111 = Query;
                                                    }
                                                } catch (IOException e11) {
                                                    r111 = Query;
                                                    m1Var7.t().K0().d("Failed to merge filter. appId", s0.O0(str16), e11);
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e12) {
                                                    e = e12;
                                                    r110 = r111;
                                                    r13 = r110;
                                                    try {
                                                        m1Var7.t().K0().d("Database error querying filters. appId", s0.O0(str16), e);
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r13 != 0) {
                                                            r13.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (r13 != 0) {
                                                            r13.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r19 = r111;
                                                    r13 = r19;
                                                    if (r13 != 0) {
                                                        r13.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                r110 = Query;
                                                r13 = r110;
                                                m1Var7.t().K0().d("Database error querying filters. appId", s0.O0(str16), e);
                                                map10 = Collections.EMPTY_MAP;
                                                if (r13 != 0) {
                                                    r13.close();
                                                }
                                                map = map10;
                                                m mVarG4 = e4Var.g0();
                                                obj = (m1) mVarG4.f3623a;
                                                r10 = this.f39264d;
                                                mVarG4.H0();
                                                mVarG4.G0();
                                                k9.c0.e(r10);
                                                cursorQuery = mVarG4.x1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    eVar8 = new x.e();
                                                    r17 = obj;
                                                    r21 = r10;
                                                    while (true) {
                                                        try {
                                                            i12 = cursorQuery.getInt(0);
                                                            try {
                                                                ga gaVar4 = (ga) ((fa) h4.r1(ga.C(), cursorQuery.getBlob(1))).f();
                                                                Object objValueOf = Integer.valueOf(i12);
                                                                eVar8.put(objValueOf, gaVar4);
                                                                str3 = str14;
                                                                obj2 = objO0;
                                                                obj3 = objValueOf;
                                                                r12 = r21;
                                                            } catch (IOException e14) {
                                                                bo.b bVarK0 = r17.t().K0();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objO0;
                                                                try {
                                                                    objO0 = s0.O0(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i12);
                                                                    bVarK0.e("Failed to merge filter results. appId, audienceId, error", objO0, numValueOf8, e14);
                                                                    obj3 = bVarK0;
                                                                    r12 = numValueOf8;
                                                                } catch (SQLiteException e15) {
                                                                    e = e15;
                                                                    r21 = r21;
                                                                    r17.t().K0().d("Database error querying filter results. appId", s0.O0(r21), e);
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        m1Var = m1Var6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z12) {
                                                                            String str17 = this.f39264d;
                                                                            mVarG0 = e4Var.g0();
                                                                            str6 = this.f39264d;
                                                                            mVarG0.H0();
                                                                            mVarG0.G0();
                                                                            k9.c0.e(str6);
                                                                            eVar3 = new x.e();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = mVarG0.x1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    eVar3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            eVar3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e16) {
                                                                                        e = e16;
                                                                                        ((m1) mVarG0.f3623a).t().K0().d("Database error querying scoped filters. appId", s0.O0(str6), e);
                                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                                        r0 = eVar3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        k9.c0.e(str17);
                                                                                        eVar4 = new x.e();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                gaVar3 = (ga) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                m1Var2 = m1Var6;
                                                                                                eVar4.put(num, gaVar3);
                                                                                                r0 = r18;
                                                                                                it2 = it3;
                                                                                                str15 = str15;
                                                                                                m1Var6 = m1Var2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        m1Var = m1Var6;
                                                                                        map3 = eVar4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            gaVar = (ga) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            eVar = new x.e();
                                                                                            if (gaVar != null) {
                                                                                                for (t9 t9Var : gaVar.y()) {
                                                                                                    if (t9Var.u()) {
                                                                                                        ga gaVar5 = gaVar;
                                                                                                        Integer numValueOf9 = Integer.valueOf(t9Var.v());
                                                                                                        if (t9Var.w()) {
                                                                                                            lValueOf = Long.valueOf(t9Var.x());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        eVar.put(numValueOf9, lValueOf);
                                                                                                        gaVar = gaVar5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            gaVar2 = gaVar;
                                                                                            eVar2 = new x.e();
                                                                                            if (gaVar2 != null) {
                                                                                                it = gaVar2.A().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    iaVar = (ia) it.next();
                                                                                                    if (!iaVar.u()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (gaVar2 != null) {
                                                                                                i10 = 0;
                                                                                                while (i10 < gaVar2.v() * 64) {
                                                                                                    if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                                                                                                        z13 = zR0;
                                                                                                        m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                                        bitSet2.set(i10);
                                                                                                        if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                                                                                            bitSet.set(i10);
                                                                                                        }
                                                                                                        i10++;
                                                                                                        zR0 = z13;
                                                                                                    } else {
                                                                                                        z13 = zR0;
                                                                                                    }
                                                                                                    eVar.remove(Integer.valueOf(i10));
                                                                                                    i10++;
                                                                                                    zR0 = z13;
                                                                                                }
                                                                                            }
                                                                                            boolean z15 = zR0;
                                                                                            ga gaVar6 = (ga) map4.get(num4);
                                                                                            if (zR1) {
                                                                                                for (j8 j8Var2 : list3) {
                                                                                                    int iV2 = j8Var2.v();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f39268h.longValue() / 1000;
                                                                                                    if (j8Var2.D()) {
                                                                                                        jLongValue = this.f39267g.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iV2);
                                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f39266f.put(num4, new o4(this, this.f39264d, gaVar6, bitSet, bitSet2, eVar, eVar2));
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str2 = str2;
                                                                                            zR0 = z15;
                                                                                            map5 = map12;
                                                                                            map4 = map4;
                                                                                            zR1 = zR1;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r14 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            lVar = new bo.l(this);
                                                                                            eVar6 = new x.e();
                                                                                            it8 = list.iterator();
                                                                                            while (it8.hasNext()) {
                                                                                                v9Var = (v9) it8.next();
                                                                                                v9VarD = lVar.d(v9Var, this.f39264d);
                                                                                                if (v9VarD != null) {
                                                                                                    rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                                                                                                    e4Var.g0().h1("events", rVarQ1);
                                                                                                    if (z10) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j10 = rVarQ1.f39731c;
                                                                                                        strZ = v9VarD.z();
                                                                                                        map8 = (Map) eVar6.get(strZ);
                                                                                                        if (map8 == null) {
                                                                                                            m mVarG5 = e4Var.g0();
                                                                                                            m1 m1Var8 = (m1) mVarG5.f3623a;
                                                                                                            str11 = this.f39264d;
                                                                                                            mVarG5.H0();
                                                                                                            mVarG5.G0();
                                                                                                            k9.c0.e(str11);
                                                                                                            k9.c0.e(strZ);
                                                                                                            eVar7 = new x.e();
                                                                                                            try {
                                                                                                                cursorQuery3 = mVarG5.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (cursorQuery3.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        j8 j8Var3 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                                                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                                                                                            } catch (SQLiteException e17) {
                                                                                                                                                e = e17;
                                                                                                                                                cursor3 = cursor4;
                                                                                                                                                try {
                                                                                                                                                    m1Var8.t().K0().d(r14, s0.O0(str12), e);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    if (cursor3 != null) {
                                                                                                                                                        cursor3.close();
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th4) {
                                                                                                                                                    th = th4;
                                                                                                                                                    cursor2 = cursor3;
                                                                                                                                                    if (cursor2 != null) {
                                                                                                                                                        cursor2.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th5) {
                                                                                                                                                th = th5;
                                                                                                                                                cursor2 = cursor4;
                                                                                                                                                if (cursor2 != null) {
                                                                                                                                                    cursor2.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            cursor4 = cursorQuery3;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(j8Var3);
                                                                                                                                    } catch (IOException e18) {
                                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                                        m1Var8.t().K0().d(str18, s0.O0(str12), e18);
                                                                                                                                    }
                                                                                                                                    if (!cursor4.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    cursorQuery3 = cursor4;
                                                                                                                                } catch (SQLiteException e19) {
                                                                                                                                    e = e19;
                                                                                                                                    cursor4 = cursorQuery3;
                                                                                                                                    cursor3 = cursor4;
                                                                                                                                    m1Var8.t().K0().d(r14, s0.O0(str12), e);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    if (cursor3 != null) {
                                                                                                                                        cursor3.close();
                                                                                                                                    }
                                                                                                                                    eVar6.put(strZ, map8);
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f39265e.contains(num6)) {
                                                                                                                                            m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it9 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it9.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    lVar2 = lVar;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                j8 j8Var4 = (j8) it9.next();
                                                                                                                                                lVar2 = lVar;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                bVar2 = new b(this, this.f39264d, iIntValue2, j8Var4, 0);
                                                                                                                                                Long l11 = this.f39267g;
                                                                                                                                                Long l12 = this.f39268h;
                                                                                                                                                iV = j8Var4.v();
                                                                                                                                                o4Var = (o4) this.f39266f.get(num3);
                                                                                                                                                if (o4Var == null) {
                                                                                                                                                    z14 = false;
                                                                                                                                                } else {
                                                                                                                                                    z14 = o4Var.f39672d.get(iV);
                                                                                                                                                }
                                                                                                                                                zA = bVar2.a(l11, l12, v9VarD, j10, rVarQ1, z14);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.f39265e.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                L0(num3).a(bVar2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                lVar = lVar2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.f39265e.add(num3);
                                                                                                                                            }
                                                                                                                                            lVar = lVar2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            cursor4.close();
                                                                                                                            map8 = eVar7;
                                                                                                                        } else {
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            cursorQuery3.close();
                                                                                                                        }
                                                                                                                    } catch (Throwable th6) {
                                                                                                                        th = th6;
                                                                                                                        cursor4 = cursorQuery3;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e20) {
                                                                                                                    e = e20;
                                                                                                                    str12 = str11;
                                                                                                                }
                                                                                                            } catch (SQLiteException e21) {
                                                                                                                e = e21;
                                                                                                                str12 = str11;
                                                                                                                cursor3 = null;
                                                                                                            } catch (Throwable th7) {
                                                                                                                th = th7;
                                                                                                                cursor2 = null;
                                                                                                            }
                                                                                                            eVar6.put(strZ, map8);
                                                                                                        }
                                                                                                        while (r18.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f39265e.contains(num6)) {
                                                                                                                m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it9 = ((List) map8.get(num6)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it9.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        lVar2 = lVar;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    j8 j8Var5 = (j8) it9.next();
                                                                                                                    lVar2 = lVar;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    bVar2 = new b(this, this.f39264d, iIntValue2, j8Var5, 0);
                                                                                                                    Long l13 = this.f39267g;
                                                                                                                    Long l14 = this.f39268h;
                                                                                                                    iV = j8Var5.v();
                                                                                                                    o4Var = (o4) this.f39266f.get(num3);
                                                                                                                    if (o4Var == null) {
                                                                                                                        z14 = false;
                                                                                                                    } else {
                                                                                                                        z14 = o4Var.f39672d.get(iV);
                                                                                                                    }
                                                                                                                    zA = bVar2.a(l13, l14, v9VarD, j10, rVarQ1, z14);
                                                                                                                    if (!zA) {
                                                                                                                        this.f39265e.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    L0(num3).a(bVar2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    lVar = lVar2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.f39265e.add(num3);
                                                                                                                }
                                                                                                                lVar = lVar2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z10) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            x.e eVar10 = new x.e();
                                                                                            it4 = list2.iterator();
                                                                                            iVar = eVar10;
                                                                                            while (it4.hasNext()) {
                                                                                                ma maVar = (ma) it4.next();
                                                                                                strW = maVar.w();
                                                                                                map6 = (Map) iVar.get(strW);
                                                                                                if (map6 == null) {
                                                                                                    m mVarG6 = e4Var.g0();
                                                                                                    m1Var4 = (m1) mVarG6.f3623a;
                                                                                                    str9 = this.f39264d;
                                                                                                    mVarG6.H0();
                                                                                                    mVarG6.G0();
                                                                                                    k9.c0.e(str9);
                                                                                                    k9.c0.e(strW);
                                                                                                    eVar5 = new x.e();
                                                                                                    try {
                                                                                                        cursorQuery2 = mVarG6.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                p8 p8Var2 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    m1Var5 = m1Var4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e22) {
                                                                                                                                        e = e22;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            m1Var5.t().K0().d(r14, s0.O0(str10), e);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            iVar.put(strW, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            iVar2 = iVar;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f39265e.contains(num2)) {
                                                                                                                                                    m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                iVar3 = iVar2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        p8Var = (p8) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                                                                                                            bo.b bVarN0 = m1Var.t().N0();
                                                                                                                                                            if (p8Var.u()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(p8Var.v());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            bVarN0.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                                                                                                            m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (p8Var.u()) {
                                                                                                                                                        }
                                                                                                                                                        bo.b bVarL0 = m1Var.t().L0();
                                                                                                                                                        r0 r0VarO0 = s0.O0(this.f39264d);
                                                                                                                                                        if (p8Var.u()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(p8Var.v());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        bVarL0.d("Invalid property filter ID. appId, id", r0VarO0, String.valueOf(numValueOf3));
                                                                                                                                                        this.f39265e.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        iVar2 = iVar3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        iVar3 = iVar3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.f39265e.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    iVar2 = iVar3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    L0(num2).a(bVar);
                                                                                                                                                    iIntValue = i11;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    iVar3 = iVar3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            iVar = iVar2;
                                                                                                                                        } catch (Throwable th8) {
                                                                                                                                            th = th8;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    m1Var5 = m1Var4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(p8Var2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e23) {
                                                                                                                                m1Var5 = m1Var4;
                                                                                                                                str10 = str9;
                                                                                                                                m1Var5.t().K0().d("Failed to merge filter", s0.O0(str10), e23);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                m1Var4 = m1Var5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e24) {
                                                                                                                                e = e24;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                m1Var5.t().K0().d(r14, s0.O0(str10), e);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e25) {
                                                                                                                            e = e25;
                                                                                                                            m1Var5 = m1Var4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            m1Var5.t().K0().d(r14, s0.O0(str10), e);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            iVar.put(strW, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            iVar2 = iVar;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f39265e.contains(num2)) {
                                                                                                                                    m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zB = true;
                                                                                                                                iVar3 = iVar2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        p8Var = (p8) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                                                                                            bo.b bVarN1 = m1Var.t().N0();
                                                                                                                                            if (p8Var.u()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(p8Var.v());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            bVarN1.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                                                                                            m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (p8Var.u()) {
                                                                                                                                        }
                                                                                                                                        bo.b bVarL1 = m1Var.t().L0();
                                                                                                                                        r0 r0VarO1 = s0.O0(this.f39264d);
                                                                                                                                        if (p8Var.u()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(p8Var.v());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        bVarL1.d("Invalid property filter ID. appId, id", r0VarO1, String.valueOf(numValueOf3));
                                                                                                                                        this.f39265e.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        iVar2 = iVar3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        iVar3 = iVar3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.f39265e.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    iVar2 = iVar3;
                                                                                                                                    it6 = it6;
                                                                                                                                    L0(num2).a(bVar);
                                                                                                                                    iIntValue = i11;
                                                                                                                                    map6 = map7;
                                                                                                                                    iVar3 = iVar3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            iVar = iVar2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = eVar5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e26) {
                                                                                                            e = e26;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e27) {
                                                                                                        e = e27;
                                                                                                        it5 = it4;
                                                                                                        m1Var5 = m1Var4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th10) {
                                                                                                        th = th10;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    iVar.put(strW, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                iVar2 = iVar;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f39265e.contains(num2)) {
                                                                                                        m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zB = true;
                                                                                                    iVar3 = iVar2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            p8Var = (p8) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                                                                bo.b bVarN2 = m1Var.t().N0();
                                                                                                                if (p8Var.u()) {
                                                                                                                    numValueOf4 = Integer.valueOf(p8Var.v());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                bVarN2.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                                                                m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                                                            }
                                                                                                            if (p8Var.u()) {
                                                                                                            }
                                                                                                            bo.b bVarL2 = m1Var.t().L0();
                                                                                                            r0 r0VarO2 = s0.O0(this.f39264d);
                                                                                                            if (p8Var.u()) {
                                                                                                                numValueOf3 = Integer.valueOf(p8Var.v());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            bVarL2.d("Invalid property filter ID. appId, id", r0VarO2, String.valueOf(numValueOf3));
                                                                                                            this.f39265e.add(num2);
                                                                                                            map6 = map7;
                                                                                                            iVar2 = iVar3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            iVar3 = iVar3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.f39265e.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        iVar2 = iVar3;
                                                                                                        it6 = it6;
                                                                                                        L0(num2).a(bVar);
                                                                                                        iIntValue = i11;
                                                                                                        map6 = map7;
                                                                                                        iVar3 = iVar3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                iVar = iVar2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        x.b<Integer> bVar3 = (x.b) this.f39266f.keySet();
                                                                                        bVar3.removeAll(this.f39265e);
                                                                                        for (Integer num7 : bVar3) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            o4 o4Var2 = (o4) this.f39266f.get(num7);
                                                                                            k9.c0.h(o4Var2);
                                                                                            n9 n9VarB = o4Var2.b(iIntValue3);
                                                                                            arrayList2.add(n9VarB);
                                                                                            mVarG1 = e4Var.g0();
                                                                                            m1Var3 = (m1) mVarG1.f3623a;
                                                                                            str8 = this.f39264d;
                                                                                            ga gaVarW = n9VarB.w();
                                                                                            mVarG1.H0();
                                                                                            mVarG1.G0();
                                                                                            k9.c0.e(str8);
                                                                                            k9.c0.h(gaVarW);
                                                                                            byte[] bArrA = gaVarW.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put(MBridgeConstans.APP_ID, str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e28) {
                                                                                                    e = e28;
                                                                                                    m1Var3.t().K0().d("Error storing filter results. appId", s0.O0(str8), e);
                                                                                                }
                                                                                            } catch (SQLiteException e29) {
                                                                                                e = e29;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e30) {
                                                                                    e = e30;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th11) {
                                                                                    th = th11;
                                                                                    r11 = 0;
                                                                                    if (r11 != 0) {
                                                                                        r11.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = eVar3;
                                                                                k9.c0.e(str17);
                                                                                eVar4 = new x.e();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        gaVar3 = (ga) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        m1Var2 = m1Var6;
                                                                                        eVar4.put(num, gaVar3);
                                                                                        r0 = r18;
                                                                                        it2 = it3;
                                                                                        str15 = str15;
                                                                                        m1Var6 = m1Var2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                m1Var = m1Var6;
                                                                                map3 = eVar4;
                                                                            } catch (Throwable th12) {
                                                                                th = th12;
                                                                                r11 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            m1Var = m1Var6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            gaVar = (ga) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            eVar = new x.e();
                                                                            if (gaVar != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (t9Var.u()) {
                                                                                        ga gaVar7 = gaVar;
                                                                                        Integer numValueOf10 = Integer.valueOf(t9Var.v());
                                                                                        if (t9Var.w()) {
                                                                                            lValueOf = Long.valueOf(t9Var.x());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        eVar.put(numValueOf10, lValueOf);
                                                                                        gaVar = gaVar7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            gaVar2 = gaVar;
                                                                            eVar2 = new x.e();
                                                                            if (gaVar2 != null) {
                                                                                it = gaVar2.A().iterator();
                                                                                while (it.hasNext()) {
                                                                                    iaVar = (ia) it.next();
                                                                                    if (!iaVar.u()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (gaVar2 != null) {
                                                                                i10 = 0;
                                                                                while (i10 < gaVar2.v() * 64) {
                                                                                    if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                                                                                        z13 = zR0;
                                                                                        m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                        bitSet2.set(i10);
                                                                                        if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                                                                            bitSet.set(i10);
                                                                                        }
                                                                                        i10++;
                                                                                        zR0 = z13;
                                                                                    } else {
                                                                                        z13 = zR0;
                                                                                    }
                                                                                    eVar.remove(Integer.valueOf(i10));
                                                                                    i10++;
                                                                                    zR0 = z13;
                                                                                }
                                                                            }
                                                                            boolean z16 = zR0;
                                                                            ga gaVar8 = (ga) map4.get(num4);
                                                                            if (zR1) {
                                                                                while (r2.hasNext()) {
                                                                                    int iV3 = j8Var2.v();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f39268h.longValue() / 1000;
                                                                                    if (j8Var2.D()) {
                                                                                        jLongValue = this.f39267g.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iV3);
                                                                                    if (eVar.containsKey(numValueOf)) {
                                                                                        eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (eVar2.containsKey(numValueOf)) {
                                                                                        eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f39266f.put(num4, new o4(this, this.f39264d, gaVar8, bitSet, bitSet2, eVar, eVar2));
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str2 = str2;
                                                                            zR0 = z16;
                                                                            map5 = map13;
                                                                            map4 = map4;
                                                                            zR1 = zR1;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r15 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        lVar = new bo.l(this);
                                                                        eVar6 = new x.e();
                                                                        it8 = list.iterator();
                                                                        while (it8.hasNext()) {
                                                                            v9Var = (v9) it8.next();
                                                                            v9VarD = lVar.d(v9Var, this.f39264d);
                                                                            if (v9VarD != null) {
                                                                                rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                                                                                e4Var.g0().h1("events", rVarQ1);
                                                                                if (z10) {
                                                                                    j10 = rVarQ1.f39731c;
                                                                                    strZ = v9VarD.z();
                                                                                    map8 = (Map) eVar6.get(strZ);
                                                                                    if (map8 == null) {
                                                                                        m mVarG7 = e4Var.g0();
                                                                                        m1 m1Var9 = (m1) mVarG7.f3623a;
                                                                                        str11 = this.f39264d;
                                                                                        mVarG7.H0();
                                                                                        mVarG7.G0();
                                                                                        k9.c0.e(str11);
                                                                                        k9.c0.e(strZ);
                                                                                        eVar7 = new x.e();
                                                                                        cursorQuery3 = mVarG7.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                        if (cursorQuery3.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            while (true) {
                                                                                                j8 j8Var6 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                                                                                numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                list6 = (List) eVar7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    cursor4 = cursorQuery3;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    eVar7.put(numValueOf6, arrayList4);
                                                                                                } else {
                                                                                                    cursor4 = cursorQuery3;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(j8Var6);
                                                                                                if (!cursor4.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                cursorQuery3 = cursor4;
                                                                                            }
                                                                                            cursor4.close();
                                                                                            map8 = eVar7;
                                                                                        } else {
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            cursorQuery3.close();
                                                                                        }
                                                                                        eVar6.put(strZ, map8);
                                                                                    }
                                                                                    while (r18.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f39265e.contains(num6)) {
                                                                                            m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it9 = ((List) map8.get(num6)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it9.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    lVar2 = lVar;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                j8 j8Var7 = (j8) it9.next();
                                                                                                lVar2 = lVar;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                bVar2 = new b(this, this.f39264d, iIntValue2, j8Var7, 0);
                                                                                                Long l15 = this.f39267g;
                                                                                                Long l16 = this.f39268h;
                                                                                                iV = j8Var7.v();
                                                                                                o4Var = (o4) this.f39266f.get(num3);
                                                                                                if (o4Var == null) {
                                                                                                    z14 = false;
                                                                                                } else {
                                                                                                    z14 = o4Var.f39672d.get(iV);
                                                                                                }
                                                                                                zA = bVar2.a(l15, l16, v9VarD, j10, rVarQ1, z14);
                                                                                                if (!zA) {
                                                                                                    this.f39265e.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                L0(num3).a(bVar2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                lVar = lVar2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.f39265e.add(num3);
                                                                                            }
                                                                                            lVar = lVar2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z10) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        x.e eVar11 = new x.e();
                                                                        it4 = list2.iterator();
                                                                        iVar = eVar11;
                                                                        while (it4.hasNext()) {
                                                                            ma maVar2 = (ma) it4.next();
                                                                            strW = maVar2.w();
                                                                            map6 = (Map) iVar.get(strW);
                                                                            if (map6 == null) {
                                                                                m mVarG8 = e4Var.g0();
                                                                                m1Var4 = (m1) mVarG8.f3623a;
                                                                                str9 = this.f39264d;
                                                                                mVarG8.H0();
                                                                                mVarG8.G0();
                                                                                k9.c0.e(str9);
                                                                                k9.c0.e(strW);
                                                                                eVar5 = new x.e();
                                                                                cursorQuery2 = mVarG8.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        p8 p8Var3 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) eVar5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            m1Var5 = m1Var4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            eVar5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            m1Var5 = m1Var4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(p8Var3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        m1Var4 = m1Var5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = eVar5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                iVar.put(strW, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            iVar2 = iVar;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f39265e.contains(num2)) {
                                                                                    m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zB = true;
                                                                                iVar3 = iVar2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        p8Var = (p8) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                                            bo.b bVarN3 = m1Var.t().N0();
                                                                                            if (p8Var.u()) {
                                                                                                numValueOf4 = Integer.valueOf(p8Var.v());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            bVarN3.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                                            m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                                        }
                                                                                        if (p8Var.u()) {
                                                                                        }
                                                                                        bo.b bVarL3 = m1Var.t().L0();
                                                                                        r0 r0VarO3 = s0.O0(this.f39264d);
                                                                                        if (p8Var.u()) {
                                                                                            numValueOf3 = Integer.valueOf(p8Var.v());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        bVarL3.d("Invalid property filter ID. appId, id", r0VarO3, String.valueOf(numValueOf3));
                                                                                        this.f39265e.add(num2);
                                                                                        map6 = map7;
                                                                                        iVar2 = iVar3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        iVar3 = iVar3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.f39265e.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    iVar2 = iVar3;
                                                                                    it6 = it6;
                                                                                    L0(num2).a(bVar);
                                                                                    iIntValue = i11;
                                                                                    map6 = map7;
                                                                                    iVar3 = iVar3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            iVar = iVar2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    x.b<Integer> bVar4 = (x.b) this.f39266f.keySet();
                                                                    bVar4.removeAll(this.f39265e);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        o4 o4Var3 = (o4) this.f39266f.get(num7);
                                                                        k9.c0.h(o4Var3);
                                                                        n9 n9VarB2 = o4Var3.b(iIntValue4);
                                                                        arrayList2.add(n9VarB2);
                                                                        mVarG1 = e4Var.g0();
                                                                        m1Var3 = (m1) mVarG1.f3623a;
                                                                        str8 = this.f39264d;
                                                                        ga gaVarW2 = n9VarB2.w();
                                                                        mVarG1.H0();
                                                                        mVarG1.G0();
                                                                        k9.c0.e(str8);
                                                                        k9.c0.h(gaVarW2);
                                                                        byte[] bArrA2 = gaVarW2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put(MBridgeConstans.APP_ID, str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objO0 = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e31) {
                                                                e = e31;
                                                                r17.t().K0().d("Database error querying filter results. appId", s0.O0(r21), e);
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e32) {
                                                            e = e32;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objO0;
                                                            r21 = r21;
                                                            r17.t().K0().d("Database error querying filter results. appId", s0.O0(r21), e);
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                m1Var = m1Var6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z12) {
                                                                    String str110 = this.f39264d;
                                                                    mVarG0 = e4Var.g0();
                                                                    str6 = this.f39264d;
                                                                    mVarG0.H0();
                                                                    mVarG0.G0();
                                                                    k9.c0.e(str6);
                                                                    eVar3 = new x.e();
                                                                    cursorRawQuery = mVarG0.x1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) eVar3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                eVar3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        eVar3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = eVar3;
                                                                    k9.c0.e(str110);
                                                                    eVar4 = new x.e();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            gaVar3 = (ga) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            m1Var2 = m1Var6;
                                                                            eVar4.put(num, gaVar3);
                                                                            r0 = r18;
                                                                            it2 = it3;
                                                                            str15 = str15;
                                                                            m1Var6 = m1Var2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    m1Var = m1Var6;
                                                                    map3 = eVar4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    m1Var = m1Var6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    gaVar = (ga) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    eVar = new x.e();
                                                                    if (gaVar != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (t9Var.u()) {
                                                                                ga gaVar9 = gaVar;
                                                                                Integer numValueOf11 = Integer.valueOf(t9Var.v());
                                                                                if (t9Var.w()) {
                                                                                    lValueOf = Long.valueOf(t9Var.x());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                eVar.put(numValueOf11, lValueOf);
                                                                                gaVar = gaVar9;
                                                                            }
                                                                        }
                                                                    }
                                                                    gaVar2 = gaVar;
                                                                    eVar2 = new x.e();
                                                                    if (gaVar2 != null) {
                                                                        it = gaVar2.A().iterator();
                                                                        while (it.hasNext()) {
                                                                            iaVar = (ia) it.next();
                                                                            if (!iaVar.u()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (gaVar2 != null) {
                                                                        i10 = 0;
                                                                        while (i10 < gaVar2.v() * 64) {
                                                                            if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                                                                                z13 = zR0;
                                                                                m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                                bitSet2.set(i10);
                                                                                if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                                                                    bitSet.set(i10);
                                                                                }
                                                                                i10++;
                                                                                zR0 = z13;
                                                                            } else {
                                                                                z13 = zR0;
                                                                            }
                                                                            eVar.remove(Integer.valueOf(i10));
                                                                            i10++;
                                                                            zR0 = z13;
                                                                        }
                                                                    }
                                                                    boolean z17 = zR0;
                                                                    ga gaVar10 = (ga) map4.get(num4);
                                                                    if (zR1) {
                                                                        while (r2.hasNext()) {
                                                                            int iV4 = j8Var2.v();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f39268h.longValue() / 1000;
                                                                            if (j8Var2.D()) {
                                                                                jLongValue = this.f39267g.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iV4);
                                                                            if (eVar.containsKey(numValueOf)) {
                                                                                eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (eVar2.containsKey(numValueOf)) {
                                                                                eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f39266f.put(num4, new o4(this, this.f39264d, gaVar10, bitSet, bitSet2, eVar, eVar2));
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str2 = str2;
                                                                    zR0 = z17;
                                                                    map5 = map16;
                                                                    map4 = map4;
                                                                    zR1 = zR1;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r16 = obj2;
                                                            if (!list.isEmpty()) {
                                                                lVar = new bo.l(this);
                                                                eVar6 = new x.e();
                                                                it8 = list.iterator();
                                                                while (it8.hasNext()) {
                                                                    v9Var = (v9) it8.next();
                                                                    v9VarD = lVar.d(v9Var, this.f39264d);
                                                                    if (v9VarD != null) {
                                                                        rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                                                                        e4Var.g0().h1("events", rVarQ1);
                                                                        if (z10) {
                                                                            j10 = rVarQ1.f39731c;
                                                                            strZ = v9VarD.z();
                                                                            map8 = (Map) eVar6.get(strZ);
                                                                            if (map8 == null) {
                                                                                m mVarG9 = e4Var.g0();
                                                                                m1 m1Var10 = (m1) mVarG9.f3623a;
                                                                                str11 = this.f39264d;
                                                                                mVarG9.H0();
                                                                                mVarG9.G0();
                                                                                k9.c0.e(str11);
                                                                                k9.c0.e(strZ);
                                                                                eVar7 = new x.e();
                                                                                cursorQuery3 = mVarG9.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                                if (cursorQuery3.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    while (true) {
                                                                                        j8 j8Var8 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                                                                        numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                        list6 = (List) eVar7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            cursor4 = cursorQuery3;
                                                                                            arrayList4 = new ArrayList();
                                                                                            eVar7.put(numValueOf6, arrayList4);
                                                                                        } else {
                                                                                            cursor4 = cursorQuery3;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(j8Var8);
                                                                                        if (!cursor4.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        cursorQuery3 = cursor4;
                                                                                    }
                                                                                    cursor4.close();
                                                                                    map8 = eVar7;
                                                                                } else {
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    cursorQuery3.close();
                                                                                }
                                                                                eVar6.put(strZ, map8);
                                                                            }
                                                                            while (r18.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f39265e.contains(num6)) {
                                                                                    m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it9 = ((List) map8.get(num6)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it9.hasNext()) {
                                                                                            map9 = map8;
                                                                                            lVar2 = lVar;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        j8 j8Var9 = (j8) it9.next();
                                                                                        lVar2 = lVar;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        bVar2 = new b(this, this.f39264d, iIntValue2, j8Var9, 0);
                                                                                        Long l17 = this.f39267g;
                                                                                        Long l18 = this.f39268h;
                                                                                        iV = j8Var9.v();
                                                                                        o4Var = (o4) this.f39266f.get(num3);
                                                                                        if (o4Var == null) {
                                                                                            z14 = false;
                                                                                        } else {
                                                                                            z14 = o4Var.f39672d.get(iV);
                                                                                        }
                                                                                        zA = bVar2.a(l17, l18, v9VarD, j10, rVarQ1, z14);
                                                                                        if (!zA) {
                                                                                            this.f39265e.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        L0(num3).a(bVar2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        lVar = lVar2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.f39265e.add(num3);
                                                                                    }
                                                                                    lVar = lVar2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z10) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                x.e eVar12 = new x.e();
                                                                it4 = list2.iterator();
                                                                iVar = eVar12;
                                                                while (it4.hasNext()) {
                                                                    ma maVar3 = (ma) it4.next();
                                                                    strW = maVar3.w();
                                                                    map6 = (Map) iVar.get(strW);
                                                                    if (map6 == null) {
                                                                        m mVarG10 = e4Var.g0();
                                                                        m1Var4 = (m1) mVarG10.f3623a;
                                                                        str9 = this.f39264d;
                                                                        mVarG10.H0();
                                                                        mVarG10.G0();
                                                                        k9.c0.e(str9);
                                                                        k9.c0.e(strW);
                                                                        eVar5 = new x.e();
                                                                        cursorQuery2 = mVarG10.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                p8 p8Var4 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) eVar5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    m1Var5 = m1Var4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    eVar5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    m1Var5 = m1Var4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(p8Var4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                m1Var4 = m1Var5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = eVar5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        iVar.put(strW, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    iVar2 = iVar;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f39265e.contains(num2)) {
                                                                            m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zB = true;
                                                                        iVar3 = iVar2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                p8Var = (p8) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                                    bo.b bVarN4 = m1Var.t().N0();
                                                                                    if (p8Var.u()) {
                                                                                        numValueOf4 = Integer.valueOf(p8Var.v());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    bVarN4.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                                    m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                                }
                                                                                if (p8Var.u()) {
                                                                                }
                                                                                bo.b bVarL4 = m1Var.t().L0();
                                                                                r0 r0VarO4 = s0.O0(this.f39264d);
                                                                                if (p8Var.u()) {
                                                                                    numValueOf3 = Integer.valueOf(p8Var.v());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                bVarL4.d("Invalid property filter ID. appId, id", r0VarO4, String.valueOf(numValueOf3));
                                                                                this.f39265e.add(num2);
                                                                                map6 = map7;
                                                                                iVar2 = iVar3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                iVar3 = iVar3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zB) {
                                                                                this.f39265e.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            iVar2 = iVar3;
                                                                            it6 = it6;
                                                                            L0(num2).a(bVar);
                                                                            iIntValue = i11;
                                                                            map6 = map7;
                                                                            iVar3 = iVar3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    iVar = iVar2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            x.b<Integer> bVar5 = (x.b) this.f39266f.keySet();
                                                            bVar5.removeAll(this.f39265e);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                o4 o4Var4 = (o4) this.f39266f.get(num7);
                                                                k9.c0.h(o4Var4);
                                                                n9 n9VarB3 = o4Var4.b(iIntValue5);
                                                                arrayList2.add(n9VarB3);
                                                                mVarG1 = e4Var.g0();
                                                                m1Var3 = (m1) mVarG1.f3623a;
                                                                str8 = this.f39264d;
                                                                ga gaVarW3 = n9VarB3.w();
                                                                mVarG1.H0();
                                                                mVarG1.G0();
                                                                k9.c0.e(str8);
                                                                k9.c0.h(gaVarW3);
                                                                byte[] bArrA3 = gaVarW3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put(MBridgeConstans.APP_ID, str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r10 = r12;
                                                    map2 = eVar8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r10 = r10;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    m1Var = m1Var6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z12) {
                                                        String str112 = this.f39264d;
                                                        mVarG0 = e4Var.g0();
                                                        str6 = this.f39264d;
                                                        mVarG0.H0();
                                                        mVarG0.G0();
                                                        k9.c0.e(str6);
                                                        eVar3 = new x.e();
                                                        cursorRawQuery = mVarG0.x1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) eVar3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    eVar3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            eVar3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = eVar3;
                                                        k9.c0.e(str112);
                                                        eVar4 = new x.e();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                gaVar3 = (ga) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                m1Var2 = m1Var6;
                                                                eVar4.put(num, gaVar3);
                                                                r0 = r18;
                                                                it2 = it3;
                                                                str15 = str15;
                                                                m1Var6 = m1Var2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        m1Var = m1Var6;
                                                        map3 = eVar4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        m1Var = m1Var6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        gaVar = (ga) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        eVar = new x.e();
                                                        if (gaVar != null) {
                                                            while (r3.hasNext()) {
                                                                if (t9Var.u()) {
                                                                    ga gaVar11 = gaVar;
                                                                    Integer numValueOf12 = Integer.valueOf(t9Var.v());
                                                                    if (t9Var.w()) {
                                                                        lValueOf = Long.valueOf(t9Var.x());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    eVar.put(numValueOf12, lValueOf);
                                                                    gaVar = gaVar11;
                                                                }
                                                            }
                                                        }
                                                        gaVar2 = gaVar;
                                                        eVar2 = new x.e();
                                                        if (gaVar2 != null) {
                                                            it = gaVar2.A().iterator();
                                                            while (it.hasNext()) {
                                                                iaVar = (ia) it.next();
                                                                if (!iaVar.u()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (gaVar2 != null) {
                                                            i10 = 0;
                                                            while (i10 < gaVar2.v() * 64) {
                                                                if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                                                                    z13 = zR0;
                                                                    m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                                    bitSet2.set(i10);
                                                                    if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                                                        bitSet.set(i10);
                                                                    }
                                                                    i10++;
                                                                    zR0 = z13;
                                                                } else {
                                                                    z13 = zR0;
                                                                }
                                                                eVar.remove(Integer.valueOf(i10));
                                                                i10++;
                                                                zR0 = z13;
                                                            }
                                                        }
                                                        boolean z18 = zR0;
                                                        ga gaVar12 = (ga) map4.get(num4);
                                                        if (zR1) {
                                                            while (r2.hasNext()) {
                                                                int iV5 = j8Var2.v();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f39268h.longValue() / 1000;
                                                                if (j8Var2.D()) {
                                                                    jLongValue = this.f39267g.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iV5);
                                                                if (eVar.containsKey(numValueOf)) {
                                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (eVar2.containsKey(numValueOf)) {
                                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f39266f.put(num4, new o4(this, this.f39264d, gaVar12, bitSet, bitSet2, eVar, eVar2));
                                                        obj2 = obj2;
                                                        map = map;
                                                        str2 = str2;
                                                        zR0 = z18;
                                                        map5 = map18;
                                                        map4 = map4;
                                                        zR1 = zR1;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r112 = obj2;
                                                if (!list.isEmpty()) {
                                                    lVar = new bo.l(this);
                                                    eVar6 = new x.e();
                                                    it8 = list.iterator();
                                                    while (it8.hasNext()) {
                                                        v9Var = (v9) it8.next();
                                                        v9VarD = lVar.d(v9Var, this.f39264d);
                                                        if (v9VarD != null) {
                                                            rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                                                            e4Var.g0().h1("events", rVarQ1);
                                                            if (z10) {
                                                                j10 = rVarQ1.f39731c;
                                                                strZ = v9VarD.z();
                                                                map8 = (Map) eVar6.get(strZ);
                                                                if (map8 == null) {
                                                                    m mVarG11 = e4Var.g0();
                                                                    m1 m1Var11 = (m1) mVarG11.f3623a;
                                                                    str11 = this.f39264d;
                                                                    mVarG11.H0();
                                                                    mVarG11.G0();
                                                                    k9.c0.e(str11);
                                                                    k9.c0.e(strZ);
                                                                    eVar7 = new x.e();
                                                                    cursorQuery3 = mVarG11.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        str12 = str11;
                                                                        while (true) {
                                                                            j8 j8Var10 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                            list6 = (List) eVar7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = new ArrayList();
                                                                                eVar7.put(numValueOf6, arrayList4);
                                                                            } else {
                                                                                cursor4 = cursorQuery3;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(j8Var10);
                                                                            if (!cursor4.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            cursorQuery3 = cursor4;
                                                                        }
                                                                        cursor4.close();
                                                                        map8 = eVar7;
                                                                    } else {
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        cursorQuery3.close();
                                                                    }
                                                                    eVar6.put(strZ, map8);
                                                                }
                                                                while (r18.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f39265e.contains(num6)) {
                                                                        m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it9 = ((List) map8.get(num6)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it9.hasNext()) {
                                                                                map9 = map8;
                                                                                lVar2 = lVar;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            j8 j8Var11 = (j8) it9.next();
                                                                            lVar2 = lVar;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            bVar2 = new b(this, this.f39264d, iIntValue2, j8Var11, 0);
                                                                            Long l19 = this.f39267g;
                                                                            Long l110 = this.f39268h;
                                                                            iV = j8Var11.v();
                                                                            o4Var = (o4) this.f39266f.get(num3);
                                                                            if (o4Var == null) {
                                                                                z14 = false;
                                                                            } else {
                                                                                z14 = o4Var.f39672d.get(iV);
                                                                            }
                                                                            zA = bVar2.a(l19, l110, v9VarD, j10, rVarQ1, z14);
                                                                            if (!zA) {
                                                                                this.f39265e.add(num3);
                                                                                break;
                                                                            }
                                                                            L0(num3).a(bVar2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            lVar = lVar2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.f39265e.add(num3);
                                                                        }
                                                                        lVar = lVar2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    x.e eVar13 = new x.e();
                                                    it4 = list2.iterator();
                                                    iVar = eVar13;
                                                    while (it4.hasNext()) {
                                                        ma maVar4 = (ma) it4.next();
                                                        strW = maVar4.w();
                                                        map6 = (Map) iVar.get(strW);
                                                        if (map6 == null) {
                                                            m mVarG12 = e4Var.g0();
                                                            m1Var4 = (m1) mVarG12.f3623a;
                                                            str9 = this.f39264d;
                                                            mVarG12.H0();
                                                            mVarG12.G0();
                                                            k9.c0.e(str9);
                                                            k9.c0.e(strW);
                                                            eVar5 = new x.e();
                                                            cursorQuery2 = mVarG12.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    p8 p8Var5 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) eVar5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        m1Var5 = m1Var4;
                                                                        arrayList3 = new ArrayList();
                                                                        eVar5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        m1Var5 = m1Var4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(p8Var5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    m1Var4 = m1Var5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = eVar5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            iVar.put(strW, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        iVar2 = iVar;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f39265e.contains(num2)) {
                                                                m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zB = true;
                                                            iVar3 = iVar2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    p8Var = (p8) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                                        bo.b bVarN5 = m1Var.t().N0();
                                                                        if (p8Var.u()) {
                                                                            numValueOf4 = Integer.valueOf(p8Var.v());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        bVarN5.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                                        m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                                    }
                                                                    if (p8Var.u()) {
                                                                    }
                                                                    bo.b bVarL5 = m1Var.t().L0();
                                                                    r0 r0VarO5 = s0.O0(this.f39264d);
                                                                    if (p8Var.u()) {
                                                                        numValueOf3 = Integer.valueOf(p8Var.v());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    bVarL5.d("Invalid property filter ID. appId, id", r0VarO5, String.valueOf(numValueOf3));
                                                                    this.f39265e.add(num2);
                                                                    map6 = map7;
                                                                    iVar2 = iVar3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    iVar3 = iVar3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zB) {
                                                                    this.f39265e.add(num2);
                                                                }
                                                                map6 = map7;
                                                                iVar2 = iVar3;
                                                                it6 = it6;
                                                                L0(num2).a(bVar);
                                                                iIntValue = i11;
                                                                map6 = map7;
                                                                iVar3 = iVar3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        iVar = iVar2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                x.b<Integer> bVar6 = (x.b) this.f39266f.keySet();
                                                bVar6.removeAll(this.f39265e);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    o4 o4Var5 = (o4) this.f39266f.get(num7);
                                                    k9.c0.h(o4Var5);
                                                    n9 n9VarB4 = o4Var5.b(iIntValue6);
                                                    arrayList2.add(n9VarB4);
                                                    mVarG1 = e4Var.g0();
                                                    m1Var3 = (m1) mVarG1.f3623a;
                                                    str8 = this.f39264d;
                                                    ga gaVarW4 = n9VarB4.w();
                                                    mVarG1.H0();
                                                    mVarG1.G0();
                                                    k9.c0.e(str8);
                                                    k9.c0.h(gaVarW4);
                                                    byte[] bArrA4 = gaVarW4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put(MBridgeConstans.APP_ID, str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = eVar9;
                                    } else {
                                        str2 = "data";
                                        Query.close();
                                    }
                                } catch (SQLiteException e33) {
                                    e = e33;
                                    str2 = "data";
                                }
                                m mVarG13 = e4Var.g0();
                                obj = (m1) mVarG13.f3623a;
                                r10 = this.f39264d;
                                mVarG13.H0();
                                mVarG13.G0();
                                k9.c0.e(r10);
                                cursorQuery = mVarG13.x1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
                                if (cursorQuery.moveToFirst()) {
                                    Map map19 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map19;
                                    str3 = "Failed to merge filter. appId";
                                    obj2 = "Database error querying filters. appId";
                                    obj = obj;
                                    r10 = r10;
                                } else {
                                    eVar8 = new x.e();
                                    r17 = obj;
                                    r21 = r10;
                                    while (true) {
                                        i12 = cursorQuery.getInt(0);
                                        ga gaVar13 = (ga) ((fa) h4.r1(ga.C(), cursorQuery.getBlob(1))).f();
                                        Object objValueOf2 = Integer.valueOf(i12);
                                        eVar8.put(objValueOf2, gaVar13);
                                        str3 = str14;
                                        obj2 = objO0;
                                        obj3 = objValueOf2;
                                        r12 = r21;
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        str14 = str3;
                                        objO0 = obj2;
                                        r21 = r21;
                                    }
                                    cursorQuery.close();
                                    obj = obj3;
                                    r10 = r12;
                                    map2 = eVar8;
                                }
                                if (map2.isEmpty()) {
                                    str5 = "audience_id";
                                    m1Var = m1Var6;
                                } else {
                                    HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                                    if (z12) {
                                        String str114 = this.f39264d;
                                        mVarG0 = e4Var.g0();
                                        str6 = this.f39264d;
                                        mVarG0.H0();
                                        mVarG0.G0();
                                        k9.c0.e(str6);
                                        eVar3 = new x.e();
                                        cursorRawQuery = mVarG0.x1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                arrayList = (List) eVar3.get(numValueOf2);
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    eVar3.put(numValueOf2, arrayList);
                                                }
                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            eVar3 = Collections.EMPTY_MAP;
                                        }
                                        cursorRawQuery.close();
                                        r0 = eVar3;
                                        k9.c0.e(str114);
                                        eVar4 = new x.e();
                                        if (!map2.isEmpty()) {
                                            it2 = map2.keySet().iterator();
                                            while (it2.hasNext()) {
                                                num = (Integer) it2.next();
                                                num.getClass();
                                                gaVar3 = (ga) map2.get(num);
                                                list4 = (List) r0.get(num);
                                                if (list4 != null || list4.isEmpty()) {
                                                    r18 = r0;
                                                    it3 = it2;
                                                    m1Var2 = m1Var6;
                                                    eVar4.put(num, gaVar3);
                                                    r0 = r18;
                                                    it2 = it3;
                                                    str15 = str15;
                                                    m1Var6 = m1Var2;
                                                } else {
                                                    ?? r113 = r0;
                                                    it3 = it2;
                                                    List listN1 = e4Var.k0().n1((com.google.android.gms.internal.measurement.r1) gaVar3.w(), list4);
                                                    if (listN1.isEmpty()) {
                                                        r0 = r113;
                                                        it2 = it3;
                                                    } else {
                                                        fa faVar = (fa) gaVar3.l();
                                                        faVar.j();
                                                        faVar.b();
                                                        ((ga) faVar.f23489b).G(listN1);
                                                        List listN2 = e4Var.k0().n1((com.google.android.gms.internal.measurement.r1) gaVar3.u(), list4);
                                                        faVar.i();
                                                        faVar.b();
                                                        ((ga) faVar.f23489b).E(listN2);
                                                        ArrayList arrayList6 = new ArrayList();
                                                        Iterator it11 = gaVar3.y().iterator();
                                                        while (it11.hasNext()) {
                                                            Iterator it12 = it11;
                                                            t9 t9Var2 = (t9) it11.next();
                                                            m1 m1Var12 = m1Var6;
                                                            if (!list4.contains(Integer.valueOf(t9Var2.v()))) {
                                                                arrayList6.add(t9Var2);
                                                            }
                                                            it11 = it12;
                                                            m1Var6 = m1Var12;
                                                        }
                                                        m1Var2 = m1Var6;
                                                        faVar.k();
                                                        faVar.b();
                                                        ((ga) faVar.f23489b).I(arrayList6);
                                                        ArrayList arrayList7 = new ArrayList();
                                                        for (ia iaVar2 : gaVar3.A()) {
                                                            if (!list4.contains(Integer.valueOf(iaVar2.v()))) {
                                                                arrayList7.add(iaVar2);
                                                            }
                                                        }
                                                        faVar.l();
                                                        faVar.b();
                                                        ((ga) faVar.f23489b).K(arrayList7);
                                                        eVar4.put(num, (ga) faVar.f());
                                                        r18 = r113;
                                                        r0 = r18;
                                                        it2 = it3;
                                                        str15 = str15;
                                                        m1Var6 = m1Var2;
                                                    }
                                                }
                                            }
                                        }
                                        str4 = str15;
                                        m1Var = m1Var6;
                                        map3 = eVar4;
                                    } else {
                                        str4 = "audience_id";
                                        m1Var = m1Var6;
                                        map3 = map2;
                                    }
                                    map5 = map3;
                                    map4 = map2;
                                    while (r17.hasNext()) {
                                        num4.getClass();
                                        gaVar = (ga) map5.get(num4);
                                        bitSet = new BitSet();
                                        bitSet2 = new BitSet();
                                        eVar = new x.e();
                                        if (gaVar != null && gaVar.z() != 0) {
                                            while (r3.hasNext()) {
                                                if (t9Var.u()) {
                                                    ga gaVar14 = gaVar;
                                                    Integer numValueOf13 = Integer.valueOf(t9Var.v());
                                                    if (t9Var.w()) {
                                                        lValueOf = Long.valueOf(t9Var.x());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    eVar.put(numValueOf13, lValueOf);
                                                    gaVar = gaVar14;
                                                }
                                            }
                                        }
                                        gaVar2 = gaVar;
                                        eVar2 = new x.e();
                                        if (gaVar2 != null && gaVar2.B() != 0) {
                                            it = gaVar2.A().iterator();
                                            while (it.hasNext()) {
                                                iaVar = (ia) it.next();
                                                if (!iaVar.u() && iaVar.x() > 0) {
                                                    eVar2.put(Integer.valueOf(iaVar.v()), Long.valueOf(iaVar.y(iaVar.x() - 1)));
                                                    it = it;
                                                    map5 = map5;
                                                }
                                            }
                                        }
                                        Map map110 = map5;
                                        if (gaVar2 != null) {
                                            i10 = 0;
                                            while (i10 < gaVar2.v() * 64) {
                                                if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                                                    z13 = zR0;
                                                    m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                                                    bitSet2.set(i10);
                                                    if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                                        bitSet.set(i10);
                                                    }
                                                    i10++;
                                                    zR0 = z13;
                                                } else {
                                                    z13 = zR0;
                                                }
                                                eVar.remove(Integer.valueOf(i10));
                                                i10++;
                                                zR0 = z13;
                                            }
                                        }
                                        boolean z19 = zR0;
                                        ga gaVar15 = (ga) map4.get(num4);
                                        if (zR1 && z19 && (list3 = (List) map.get(num4)) != null && this.f39268h != null && this.f39267g != null) {
                                            while (r2.hasNext()) {
                                                int iV6 = j8Var2.v();
                                                Integer num11 = num4;
                                                jLongValue = this.f39268h.longValue() / 1000;
                                                if (j8Var2.D()) {
                                                    jLongValue = this.f39267g.longValue() / 1000;
                                                }
                                                numValueOf = Integer.valueOf(iV6);
                                                if (eVar.containsKey(numValueOf)) {
                                                    eVar.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                if (eVar2.containsKey(numValueOf)) {
                                                    eVar2.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                num4 = num11;
                                            }
                                        }
                                        this.f39266f.put(num4, new o4(this, this.f39264d, gaVar15, bitSet, bitSet2, eVar, eVar2));
                                        obj2 = obj2;
                                        map = map;
                                        str2 = str2;
                                        zR0 = z19;
                                        map5 = map110;
                                        map4 = map4;
                                        zR1 = zR1;
                                    }
                                    str5 = str4;
                                }
                                str7 = str2;
                                String str115 = str3;
                                ?? r114 = obj2;
                                if (!list.isEmpty()) {
                                    lVar = new bo.l(this);
                                    eVar6 = new x.e();
                                    it8 = list.iterator();
                                    while (it8.hasNext()) {
                                        v9Var = (v9) it8.next();
                                        v9VarD = lVar.d(v9Var, this.f39264d);
                                        if (v9VarD != null) {
                                            rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                                            e4Var.g0().h1("events", rVarQ1);
                                            if (z10) {
                                                j10 = rVarQ1.f39731c;
                                                strZ = v9VarD.z();
                                                map8 = (Map) eVar6.get(strZ);
                                                if (map8 == null) {
                                                    m mVarG14 = e4Var.g0();
                                                    m1 m1Var13 = (m1) mVarG14.f3623a;
                                                    str11 = this.f39264d;
                                                    mVarG14.H0();
                                                    mVarG14.G0();
                                                    k9.c0.e(str11);
                                                    k9.c0.e(strZ);
                                                    eVar7 = new x.e();
                                                    cursorQuery3 = mVarG14.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                                                    if (cursorQuery3.moveToFirst()) {
                                                        str12 = str11;
                                                        while (true) {
                                                            j8 j8Var12 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                                            numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                                            list6 = (List) eVar7.get(numValueOf6);
                                                            if (list6 == null) {
                                                                cursor4 = cursorQuery3;
                                                                arrayList4 = new ArrayList();
                                                                eVar7.put(numValueOf6, arrayList4);
                                                            } else {
                                                                cursor4 = cursorQuery3;
                                                                arrayList4 = list6;
                                                            }
                                                            arrayList4.add(j8Var12);
                                                            if (!cursor4.moveToNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            cursorQuery3 = cursor4;
                                                        }
                                                        cursor4.close();
                                                        map8 = eVar7;
                                                    } else {
                                                        map8 = Collections.EMPTY_MAP;
                                                        cursorQuery3.close();
                                                    }
                                                    eVar6.put(strZ, map8);
                                                }
                                                while (r18.hasNext()) {
                                                    iIntValue2 = num6.intValue();
                                                    if (this.f39265e.contains(num6)) {
                                                        m1Var.t().N0().c(num6, "Skipping failed audience ID");
                                                    } else {
                                                        it9 = ((List) map8.get(num6)).iterator();
                                                        zA = true;
                                                        while (true) {
                                                            if (!it9.hasNext()) {
                                                                map9 = map8;
                                                                lVar2 = lVar;
                                                                num3 = num6;
                                                                break;
                                                            }
                                                            j8 j8Var13 = (j8) it9.next();
                                                            lVar2 = lVar;
                                                            num3 = num6;
                                                            map9 = map8;
                                                            bVar2 = new b(this, this.f39264d, iIntValue2, j8Var13, 0);
                                                            Long l111 = this.f39267g;
                                                            Long l112 = this.f39268h;
                                                            iV = j8Var13.v();
                                                            o4Var = (o4) this.f39266f.get(num3);
                                                            if (o4Var == null) {
                                                                z14 = false;
                                                            } else {
                                                                z14 = o4Var.f39672d.get(iV);
                                                            }
                                                            zA = bVar2.a(l111, l112, v9VarD, j10, rVarQ1, z14);
                                                            if (!zA) {
                                                                this.f39265e.add(num3);
                                                                break;
                                                            }
                                                            L0(num3).a(bVar2);
                                                            num6 = num3;
                                                            map8 = map9;
                                                            lVar = lVar2;
                                                        }
                                                        if (!zA) {
                                                            this.f39265e.add(num3);
                                                        }
                                                        lVar = lVar2;
                                                        map8 = map9;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                if (!z10) {
                                    return new ArrayList();
                                }
                                if (!list2.isEmpty()) {
                                    x.e eVar14 = new x.e();
                                    it4 = list2.iterator();
                                    iVar = eVar14;
                                    while (it4.hasNext()) {
                                        ma maVar5 = (ma) it4.next();
                                        strW = maVar5.w();
                                        map6 = (Map) iVar.get(strW);
                                        if (map6 == null) {
                                            m mVarG15 = e4Var.g0();
                                            m1Var4 = (m1) mVarG15.f3623a;
                                            str9 = this.f39264d;
                                            mVarG15.H0();
                                            mVarG15.G0();
                                            k9.c0.e(str9);
                                            k9.c0.e(strW);
                                            eVar5 = new x.e();
                                            cursorQuery2 = mVarG15.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                it5 = it4;
                                                while (true) {
                                                    p8 p8Var6 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) eVar5.get(numValueOf5);
                                                    if (list5 == null) {
                                                        m1Var5 = m1Var4;
                                                        arrayList3 = new ArrayList();
                                                        eVar5.put(numValueOf5, arrayList3);
                                                    } else {
                                                        m1Var5 = m1Var4;
                                                        arrayList3 = list5;
                                                    }
                                                    arrayList3.add(p8Var6);
                                                    str10 = str9;
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    m1Var4 = m1Var5;
                                                    str9 = str10;
                                                }
                                                cursorQuery2.close();
                                                map6 = eVar5;
                                            } else {
                                                it5 = it4;
                                                map6 = Collections.EMPTY_MAP;
                                                cursorQuery2.close();
                                            }
                                            iVar.put(strW, map6);
                                        } else {
                                            it5 = it4;
                                        }
                                        it6 = map6.keySet().iterator();
                                        iVar2 = iVar;
                                        while (it6.hasNext()) {
                                            num2 = (Integer) it6.next();
                                            iIntValue = num2.intValue();
                                            if (this.f39265e.contains(num2)) {
                                                m1Var.t().N0().c(num2, "Skipping failed audience ID");
                                                break;
                                                break;
                                            }
                                            it7 = ((List) map6.get(num2)).iterator();
                                            zB = true;
                                            iVar3 = iVar2;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    p8Var = (p8) it7.next();
                                                    map7 = map6;
                                                    if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                                        bo.b bVarN6 = m1Var.t().N0();
                                                        if (p8Var.u()) {
                                                            numValueOf4 = Integer.valueOf(p8Var.v());
                                                        } else {
                                                            numValueOf4 = null;
                                                        }
                                                        bVarN6.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                                        m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                                                    }
                                                    if (p8Var.u() || p8Var.v() > 256) {
                                                        bo.b bVarL6 = m1Var.t().L0();
                                                        r0 r0VarO6 = s0.O0(this.f39264d);
                                                        if (p8Var.u()) {
                                                            numValueOf3 = Integer.valueOf(p8Var.v());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        bVarL6.d("Invalid property filter ID. appId, id", r0VarO6, String.valueOf(numValueOf3));
                                                        this.f39265e.add(num2);
                                                        map6 = map7;
                                                        iVar2 = iVar3;
                                                        it6 = it6;
                                                    } else {
                                                        i11 = iIntValue;
                                                        bVar = new b(this, this.f39264d, i11, p8Var, 1);
                                                        Long l20 = this.f39267g;
                                                        Long l21 = this.f39268h;
                                                        int iV7 = p8Var.v();
                                                        o4 o4Var6 = (o4) this.f39266f.get(num2);
                                                        zB = bVar.b(l20, l21, maVar5, o4Var6 == null ? false : o4Var6.f39672d.get(iV7));
                                                        if (zB) {
                                                            L0(num2).a(bVar);
                                                            iIntValue = i11;
                                                            map6 = map7;
                                                            iVar3 = iVar3;
                                                            it6 = it6;
                                                        } else {
                                                            this.f39265e.add(num2);
                                                            iVar3 = iVar3;
                                                        }
                                                    }
                                                } else {
                                                    map7 = map6;
                                                    iVar3 = iVar3;
                                                    it6 = it6;
                                                }
                                                if (!zB) {
                                                    this.f39265e.add(num2);
                                                }
                                                map6 = map7;
                                                iVar2 = iVar3;
                                                it6 = it6;
                                            }
                                        }
                                        it4 = it5;
                                        iVar = iVar2;
                                    }
                                }
                                arrayList2 = new ArrayList();
                                x.b<Integer> bVar7 = (x.b) this.f39266f.keySet();
                                bVar7.removeAll(this.f39265e);
                                while (r3.hasNext()) {
                                    int iIntValue7 = num7.intValue();
                                    o4 o4Var7 = (o4) this.f39266f.get(num7);
                                    k9.c0.h(o4Var7);
                                    n9 n9VarB5 = o4Var7.b(iIntValue7);
                                    arrayList2.add(n9VarB5);
                                    mVarG1 = e4Var.g0();
                                    m1Var3 = (m1) mVarG1.f3623a;
                                    str8 = this.f39264d;
                                    ga gaVarW5 = n9VarB5.w();
                                    mVarG1.H0();
                                    mVarG1.G0();
                                    k9.c0.e(str8);
                                    k9.c0.h(gaVarW5);
                                    byte[] bArrA5 = gaVarW5.a();
                                    contentValues = new ContentValues();
                                    contentValues.put(MBridgeConstans.APP_ID, str8);
                                    contentValues.put(str5, num7);
                                    contentValues.put("current_results", bArrA5);
                                    if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                        m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
                                    }
                                }
                                return arrayList2;
                            } catch (Throwable th13) {
                                th = th13;
                                r19 = Query;
                            }
                        } catch (SQLiteException e34) {
                            e = e34;
                            str2 = "data";
                            r13 = 0;
                        } catch (Throwable th14) {
                            th = th14;
                            r13 = 0;
                        }
                    } else {
                        z12 = z11;
                        str2 = "data";
                    }
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r10 = r10;
                    } else {
                        eVar8 = new x.e();
                        r17 = obj;
                        r21 = r10;
                        while (true) {
                            i12 = cursorQuery.getInt(0);
                            ga gaVar16 = (ga) ((fa) h4.r1(ga.C(), cursorQuery.getBlob(1))).f();
                            Object objValueOf3 = Integer.valueOf(i12);
                            eVar8.put(objValueOf3, gaVar16);
                            str3 = str14;
                            obj2 = objO0;
                            obj3 = objValueOf3;
                            r12 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objO0 = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r10 = r12;
                        map2 = eVar8;
                    }
                } catch (Throwable th15) {
                    th = th15;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e35) {
                e = e35;
                r17 = obj;
                r21 = r10;
            }
            cursorQuery = mVarG13.x1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r10}, null, null, null);
        } catch (SQLiteException e36) {
            e = e36;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r10;
            cursorQuery = null;
        } catch (Throwable th16) {
            th = th16;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        m mVarG16 = e4Var.g0();
        obj = (m1) mVarG16.f3623a;
        r10 = this.f39264d;
        mVarG16.H0();
        mVarG16.G0();
        k9.c0.e(r10);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            m1Var = m1Var6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z12) {
                String str116 = this.f39264d;
                mVarG0 = e4Var.g0();
                str6 = this.f39264d;
                mVarG0.H0();
                mVarG0.G0();
                k9.c0.e(str6);
                eVar3 = new x.e();
                cursorRawQuery = mVarG0.x1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) eVar3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            eVar3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    eVar3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = eVar3;
                k9.c0.e(str116);
                eVar4 = new x.e();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        gaVar3 = (ga) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        m1Var2 = m1Var6;
                        eVar4.put(num, gaVar3);
                        r0 = r18;
                        it2 = it3;
                        str15 = str15;
                        m1Var6 = m1Var2;
                    }
                }
                str4 = str15;
                m1Var = m1Var6;
                map3 = eVar4;
            } else {
                str4 = "audience_id";
                m1Var = m1Var6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                gaVar = (ga) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                eVar = new x.e();
                if (gaVar != null) {
                    while (r3.hasNext()) {
                        if (t9Var.u()) {
                            ga gaVar17 = gaVar;
                            Integer numValueOf14 = Integer.valueOf(t9Var.v());
                            if (t9Var.w()) {
                                lValueOf = Long.valueOf(t9Var.x());
                            } else {
                                lValueOf = null;
                            }
                            eVar.put(numValueOf14, lValueOf);
                            gaVar = gaVar17;
                        }
                    }
                }
                gaVar2 = gaVar;
                eVar2 = new x.e();
                if (gaVar2 != null) {
                    it = gaVar2.A().iterator();
                    while (it.hasNext()) {
                        iaVar = (ia) it.next();
                        if (!iaVar.u()) {
                        }
                    }
                }
                Map map112 = map5;
                if (gaVar2 != null) {
                    i10 = 0;
                    while (i10 < gaVar2.v() * 64) {
                        if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.u(), i10)) {
                            z13 = zR0;
                            m1Var.t().N0().d("Filter already evaluated. audience ID, filter ID", num4, Integer.valueOf(i10));
                            bitSet2.set(i10);
                            if (h4.l1((com.google.android.gms.internal.measurement.r1) gaVar2.w(), i10)) {
                                bitSet.set(i10);
                            }
                            i10++;
                            zR0 = z13;
                        } else {
                            z13 = zR0;
                        }
                        eVar.remove(Integer.valueOf(i10));
                        i10++;
                        zR0 = z13;
                    }
                }
                boolean z110 = zR0;
                ga gaVar18 = (ga) map4.get(num4);
                if (zR1) {
                    while (r2.hasNext()) {
                        int iV8 = j8Var2.v();
                        Integer num12 = num4;
                        jLongValue = this.f39268h.longValue() / 1000;
                        if (j8Var2.D()) {
                            jLongValue = this.f39267g.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iV8);
                        if (eVar.containsKey(numValueOf)) {
                            eVar.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (eVar2.containsKey(numValueOf)) {
                            eVar2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f39266f.put(num4, new o4(this, this.f39264d, gaVar18, bitSet, bitSet2, eVar, eVar2));
                obj2 = obj2;
                map = map;
                str2 = str2;
                zR0 = z110;
                map5 = map112;
                map4 = map4;
                zR1 = zR1;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r115 = obj2;
        if (!list.isEmpty()) {
            lVar = new bo.l(this);
            eVar6 = new x.e();
            it8 = list.iterator();
            while (it8.hasNext()) {
                v9Var = (v9) it8.next();
                v9VarD = lVar.d(v9Var, this.f39264d);
                if (v9VarD != null) {
                    rVarQ1 = e4Var.g0().q1(this.f39264d, v9Var, v9VarD.z());
                    e4Var.g0().h1("events", rVarQ1);
                    if (z10) {
                        j10 = rVarQ1.f39731c;
                        strZ = v9VarD.z();
                        map8 = (Map) eVar6.get(strZ);
                        if (map8 == null) {
                            m mVarG17 = e4Var.g0();
                            m1 m1Var14 = (m1) mVarG17.f3623a;
                            str11 = this.f39264d;
                            mVarG17.H0();
                            mVarG17.G0();
                            k9.c0.e(str11);
                            k9.c0.e(strZ);
                            eVar7 = new x.e();
                            cursorQuery3 = mVarG17.x1().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strZ}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                str12 = str11;
                                while (true) {
                                    j8 j8Var14 = (j8) ((i8) h4.r1(j8.G(), cursorQuery3.getBlob(1))).f();
                                    numValueOf6 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list6 = (List) eVar7.get(numValueOf6);
                                    if (list6 == null) {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = new ArrayList();
                                        eVar7.put(numValueOf6, arrayList4);
                                    } else {
                                        cursor4 = cursorQuery3;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(j8Var14);
                                    if (!cursor4.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    cursorQuery3 = cursor4;
                                }
                                cursor4.close();
                                map8 = eVar7;
                            } else {
                                map8 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            eVar6.put(strZ, map8);
                        }
                        while (r18.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f39265e.contains(num6)) {
                                m1Var.t().N0().c(num6, "Skipping failed audience ID");
                            } else {
                                it9 = ((List) map8.get(num6)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it9.hasNext()) {
                                        map9 = map8;
                                        lVar2 = lVar;
                                        num3 = num6;
                                        break;
                                    }
                                    j8 j8Var15 = (j8) it9.next();
                                    lVar2 = lVar;
                                    num3 = num6;
                                    map9 = map8;
                                    bVar2 = new b(this, this.f39264d, iIntValue2, j8Var15, 0);
                                    Long l113 = this.f39267g;
                                    Long l114 = this.f39268h;
                                    iV = j8Var15.v();
                                    o4Var = (o4) this.f39266f.get(num3);
                                    if (o4Var == null) {
                                        z14 = false;
                                    } else {
                                        z14 = o4Var.f39672d.get(iV);
                                    }
                                    zA = bVar2.a(l113, l114, v9VarD, j10, rVarQ1, z14);
                                    if (!zA) {
                                        this.f39265e.add(num3);
                                        break;
                                    }
                                    L0(num3).a(bVar2);
                                    num6 = num3;
                                    map8 = map9;
                                    lVar = lVar2;
                                }
                                if (!zA) {
                                    this.f39265e.add(num3);
                                }
                                lVar = lVar2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z10) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            x.e eVar15 = new x.e();
            it4 = list2.iterator();
            iVar = eVar15;
            while (it4.hasNext()) {
                ma maVar6 = (ma) it4.next();
                strW = maVar6.w();
                map6 = (Map) iVar.get(strW);
                if (map6 == null) {
                    m mVarG18 = e4Var.g0();
                    m1Var4 = (m1) mVarG18.f3623a;
                    str9 = this.f39264d;
                    mVarG18.H0();
                    mVarG18.G0();
                    k9.c0.e(str9);
                    k9.c0.e(strW);
                    eVar5 = new x.e();
                    cursorQuery2 = mVarG18.x1().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strW}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            p8 p8Var7 = (p8) ((o8) h4.r1(p8.C(), cursorQuery2.getBlob(1))).f();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) eVar5.get(numValueOf5);
                            if (list5 == null) {
                                m1Var5 = m1Var4;
                                arrayList3 = new ArrayList();
                                eVar5.put(numValueOf5, arrayList3);
                            } else {
                                m1Var5 = m1Var4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(p8Var7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            m1Var4 = m1Var5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = eVar5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    iVar.put(strW, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                iVar2 = iVar;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f39265e.contains(num2)) {
                        m1Var.t().N0().c(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zB = true;
                    iVar3 = iVar2;
                    while (true) {
                        if (it7.hasNext()) {
                            p8Var = (p8) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(m1Var.t().Q0(), 2)) {
                                bo.b bVarN7 = m1Var.t().N0();
                                if (p8Var.u()) {
                                    numValueOf4 = Integer.valueOf(p8Var.v());
                                } else {
                                    numValueOf4 = null;
                                }
                                bVarN7.e("Evaluating filter. audience, filter, property", num2, numValueOf4, m1Var.i().c(p8Var.w()));
                                m1Var.t().N0().c(e4Var.k0().i1(p8Var), "Filter definition");
                            }
                            if (p8Var.u()) {
                            }
                            bo.b bVarL7 = m1Var.t().L0();
                            r0 r0VarO7 = s0.O0(this.f39264d);
                            if (p8Var.u()) {
                                numValueOf3 = Integer.valueOf(p8Var.v());
                            } else {
                                numValueOf3 = null;
                            }
                            bVarL7.d("Invalid property filter ID. appId, id", r0VarO7, String.valueOf(numValueOf3));
                            this.f39265e.add(num2);
                            map6 = map7;
                            iVar2 = iVar3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            iVar3 = iVar3;
                            it6 = it6;
                        }
                        if (!zB) {
                            this.f39265e.add(num2);
                        }
                        map6 = map7;
                        iVar2 = iVar3;
                        it6 = it6;
                        L0(num2).a(bVar);
                        iIntValue = i11;
                        map6 = map7;
                        iVar3 = iVar3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                iVar = iVar2;
            }
        }
        arrayList2 = new ArrayList();
        x.b<Integer> bVar8 = (x.b) this.f39266f.keySet();
        bVar8.removeAll(this.f39265e);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            o4 o4Var8 = (o4) this.f39266f.get(num7);
            k9.c0.h(o4Var8);
            n9 n9VarB6 = o4Var8.b(iIntValue8);
            arrayList2.add(n9VarB6);
            mVarG1 = e4Var.g0();
            m1Var3 = (m1) mVarG1.f3623a;
            str8 = this.f39264d;
            ga gaVarW6 = n9VarB6.w();
            mVarG1.H0();
            mVarG1.G0();
            k9.c0.e(str8);
            k9.c0.h(gaVarW6);
            byte[] bArrA6 = gaVarW6.a();
            contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (mVarG1.x1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                m1Var3.t().K0().c(s0.O0(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final o4 L0(Integer num) {
        if (this.f39266f.containsKey(num)) {
            return (o4) this.f39266f.get(num);
        }
        o4 o4Var = new o4(this, this.f39264d);
        this.f39266f.put(num, o4Var);
        return o4Var;
    }

    @Override // ea.z3
    public final void J0() {
    }
}
