package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d42 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f13387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iw0 f13388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ay0 f13389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h42 f13390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qf0 f13391e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f13393g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public po1 f13396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h3 f13397k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h42 f13398m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q2 f13392f = new q2();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13394h = true;

    public d42(h42 h42Var, Uri uri, wk1 wk1Var, ay0 ay0Var, h42 h42Var2, qf0 qf0Var) {
        this.f13398m = h42Var;
        this.f13387a = uri;
        this.f13388b = new iw0(wk1Var);
        this.f13389c = ay0Var;
        this.f13390d = h42Var2;
        this.f13391e = qf0Var;
        j32.f15961a.getAndIncrement();
        this.f13396j = b(0L, null);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0241 */
    /* JADX WARN: Code duplicated, block: B:105:0x021d A[Catch: all -> 0x024f, TryCatch #7 {all -> 0x024f, blocks: (B:92:0x0203, B:94:0x0207, B:95:0x0209, B:102:0x0214, B:103:0x0215, B:105:0x021d, B:107:0x0223, B:127:0x024e, B:131:0x0252, B:132:0x0253, B:133:0x0258), top: B:172:0x0203, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223 A[Catch: all -> 0x024f, TRY_LEAVE, TryCatch #7 {all -> 0x024f, blocks: (B:92:0x0203, B:94:0x0207, B:95:0x0209, B:102:0x0214, B:103:0x0215, B:105:0x021d, B:107:0x0223, B:127:0x024e, B:131:0x0252, B:132:0x0253, B:133:0x0258), top: B:172:0x0203, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0234 A[Catch: all -> 0x0241, TRY_LEAVE, TryCatch #0 {, blocks: (B:110:0x022d, B:112:0x0234, B:114:0x0237, B:115:0x0238, B:121:0x0245, B:113:0x0235), top: B:158:0x022d, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0261  */
    /* JADX WARN: Code duplicated, block: B:139:0x0263  */
    /* JADX WARN: Code duplicated, block: B:141:0x026b  */
    /* JADX WARN: Code duplicated, block: B:146:0x027c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0286  */
    /* JADX WARN: Code duplicated, block: B:162:0x0235 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x0203 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x020a A[EXC_TOP_SPLITTER, LOOP:2: B:173:0x020a->B:198:?, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x024e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e3 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0103  */
    /* JADX WARN: Code duplicated, block: B:50:0x010f A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x0125 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:58:0x0141 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x014d  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180 A[Catch: all -> 0x00c7, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0188  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f2 A[Catch: all -> 0x00c7, TRY_LEAVE, TryCatch #4 {all -> 0x00c7, blocks: (B:29:0x0095, B:30:0x009b, B:40:0x00d9, B:42:0x00e3, B:44:0x00ef, B:46:0x00f9, B:48:0x0105, B:50:0x010f, B:52:0x011b, B:54:0x0125, B:56:0x0137, B:58:0x0141, B:59:0x0147, B:67:0x0180, B:69:0x018a, B:71:0x0194, B:73:0x0199, B:77:0x01a4, B:79:0x01c7, B:81:0x01de, B:84:0x01e5, B:86:0x01e9, B:87:0x01ee, B:89:0x01f2, B:62:0x0151, B:65:0x0171, B:34:0x00a7, B:39:0x00cb), top: B:166:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x020e A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #8 {all -> 0x0212, blocks: (B:96:0x020a, B:98:0x020e), top: B:173:0x020a }] */
    /* JADX WARN: Type inference failed for: r8v14, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d42.a():void");
    }

    public final po1 b(long j10, String str) {
        Map mapP = h42.O;
        if (str != null && !str.startsWith("W/")) {
            pb pbVar = new pb(4);
            pbVar.i(mapP.entrySet());
            pbVar.e("If-Range", str);
            mapP = pbVar.p(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.f13387a;
        ps1.e0(uri, "The uri must be set.");
        return new po1(uri, mapP, j10, -1L, 6);
    }
}
