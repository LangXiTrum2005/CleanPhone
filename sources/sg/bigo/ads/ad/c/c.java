package sg.bigo.ads.ad.c;

import sg.bigo.ads.api.core.g;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f45634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f45635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f45636c;

    public c(g gVar) {
        this.f45634a = 2;
        this.f45635b = 0;
        this.f45636c = 1;
        if (gVar == null) {
            return;
        }
        this.f45634a = gVar.f47032a.ao();
        this.f45635b = gVar.f47032a.ap();
        this.f45636c = gVar.f47032a.aq();
    }
}
