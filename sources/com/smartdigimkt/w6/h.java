package com.smartdigimkt.w6;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f39538A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f39539B;
    private int C;
    private int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f39540E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private String f39541F = "";
    private String G;
    private String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f39542I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private String f39543J;
    private long K;
    private long L;
    private long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f39544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f39545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f39546c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39547e;
    private String f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f39548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f39549i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f39550l;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f39551n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39552p;
    private String q;
    private String r;
    private int s;
    private String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f39553u;
    private String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f39554w;
    private int x;
    private boolean y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f39555z;

    public String A() {
        return this.d;
    }

    public int B() {
        return this.s;
    }

    public int C() {
        return this.x;
    }

    public String D() {
        return this.f;
    }

    public String E() {
        return this.H;
    }

    public long F() {
        return this.K;
    }

    public int G() {
        return this.f39540E;
    }

    public String H() {
        return this.f39546c;
    }

    public int I() {
        return this.f39539B;
    }

    public String J() {
        return this.g;
    }

    public String K() {
        return this.f39544a;
    }

    public String L() {
        return this.f39547e;
    }

    public boolean M() {
        return this.y;
    }

    public boolean N() {
        return this.f39549i == 1;
    }

    public void a(boolean z2) {
        this.y = z2;
    }

    public String b() {
        return this.f39542I;
    }

    public void c(int i2) {
        this.f39551n = i2;
    }

    public void d(String str) {
        this.f39545b = str;
    }

    public void e(int i2) {
        this.D = i2;
    }

    public void f(String str) {
        this.r = str;
    }

    public String g() {
        return this.f39545b;
    }

    public void h(String str) {
        this.f39541F = str;
    }

    public String i() {
        return this.r;
    }

    public void j(String str) {
        this.f39554w = str;
    }

    public void k(String str) {
        this.q = str;
    }

    public String l() {
        return this.f39541F;
    }

    public void m(int i2) {
        this.f39540E = i2;
    }

    public void n(String str) {
        this.f = str;
    }

    public int o() {
        return this.D;
    }

    public void p(String str) {
        this.f39546c = str;
    }

    public void q(String str) {
        this.g = str;
    }

    public String r() {
        return this.f39554w;
    }

    public void s(String str) {
        this.f39547e = str;
    }

    public String t() {
        return this.q;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadTaskBean{uniqueID='");
        sb.append(this.f39544a);
        sb.append("', clickId='");
        sb.append(this.f39545b);
        sb.append("', requestId='");
        sb.append(this.f39546c);
        sb.append("', offerId='");
        sb.append(this.d);
        sb.append("', url='");
        sb.append(this.f39547e);
        sb.append("', pkgName='");
        sb.append(this.f);
        sb.append("', title='");
        sb.append(this.g);
        sb.append("', deeplinkClickAction='");
        sb.append(this.f39548h);
        sb.append("', enableUseWebViewUa=");
        sb.append(this.f39549i);
        sb.append(", downloadType=");
        sb.append(this.j);
        sb.append(", notificationType=");
        sb.append(this.k);
        sb.append(", intOpenSwitch=");
        sb.append(this.f39550l);
        sb.append(", intOpenTime=");
        sb.append(this.m);
        sb.append(", apkVerify=");
        sb.append(this.f39551n);
        sb.append(", apkReDownload=");
        sb.append(this.o);
        sb.append(", apkAllowInstallInBg=");
        sb.append(this.f39552p);
        sb.append(", iconUrl='");
        sb.append(this.q);
        sb.append("', deeplinkUrl='");
        sb.append(this.r);
        sb.append("', offerSourceType=");
        sb.append(this.s);
        sb.append(", appName='");
        sb.append(this.t);
        sb.append("', filePath='");
        sb.append(this.f39554w);
        sb.append("', partCount=");
        sb.append(this.x);
        sb.append(", enablePartDownload=");
        sb.append(this.y);
        sb.append(", downloadStartTimeStamp=");
        sb.append(this.f39555z);
        sb.append(", downloadEndTimeStamp=");
        sb.append(this.f39538A);
        sb.append(", status=");
        sb.append(this.f39539B);
        sb.append(", isUploadInstalledAgentEvent=");
        sb.append(this.C);
        sb.append(", downloadingScene=");
        sb.append(this.D);
        sb.append(", recoverDownloadScene=");
        sb.append(this.f39540E);
        sb.append(", downloadFailedSceneList='");
        sb.append(this.f39541F);
        sb.append("', actionOfferDownloadTk='");
        sb.append(this.G);
        sb.append("', placementId='");
        sb.append(this.H);
        sb.append("', adSourceId='");
        sb.append(this.f39542I);
        sb.append("', networkFirmId='");
        sb.append(this.f39543J);
        sb.append("', progress=");
        sb.append(this.K);
        sb.append(", fileSize=");
        sb.append(this.L);
        sb.append(", offerCacheTime=");
        sb.append(this.M);
        sb.append(", dspId=");
        sb.append(this.f39553u);
        sb.append(", desc=");
        return androidx.media3.extractor.text.ttml.a.p(sb, this.v, AbstractJsonLexerKt.END_OBJ);
    }

    public int u() {
        return this.f39550l;
    }

    public int v() {
        return this.m;
    }

    public int w() {
        return this.C;
    }

    public String x() {
        return this.f39543J;
    }

    public int y() {
        return this.k;
    }

    public long z() {
        return this.M;
    }

    public void a(long j) {
        this.f39538A = j;
    }

    public void b(String str) {
        this.f39542I = str;
    }

    public void c(long j) {
        this.L = j;
    }

    public void d(int i2) {
        this.j = i2;
    }

    public void e(String str) {
        this.f39548h = str;
    }

    public void f(int i2) {
        this.f39549i = i2;
    }

    public void g(int i2) {
        this.f39550l = i2;
    }

    public String h() {
        return this.f39548h;
    }

    public void i(int i2) {
        this.C = i2;
    }

    public void j(int i2) {
        this.k = i2;
    }

    public void k(int i2) {
        this.s = i2;
    }

    public void l(String str) {
        this.f39543J = str;
    }

    public void m(String str) {
        this.d = str;
    }

    public int n() {
        return this.j;
    }

    public void o(String str) {
        this.H = str;
    }

    public String p() {
        return this.f39553u;
    }

    public int q() {
        return this.f39549i;
    }

    public void r(String str) {
        this.f39544a = str;
    }

    public long s() {
        return this.L;
    }

    public void a(int i2) {
        this.f39552p = i2;
    }

    public void b(long j) {
        this.f39555z = j;
    }

    public int c() {
        return this.f39552p;
    }

    public int d() {
        return this.o;
    }

    public int e() {
        return this.f39551n;
    }

    public String f() {
        return this.t;
    }

    public void g(String str) {
        this.v = str;
    }

    public void h(int i2) {
        this.m = i2;
    }

    public void i(String str) {
        this.f39553u = str;
    }

    public String j() {
        return this.v;
    }

    public long k() {
        return this.f39538A;
    }

    public void l(int i2) {
        this.x = i2;
    }

    public long m() {
        return this.f39555z;
    }

    public void n(int i2) {
        this.f39539B = i2;
    }

    public String a() {
        return this.G;
    }

    public void b(int i2) {
        this.o = i2;
    }

    public void c(String str) {
        this.t = str;
    }

    public void d(long j) {
        this.M = j;
    }

    public void e(long j) {
        this.K = j;
    }

    public void a(String str) {
        this.G = str;
    }
}
