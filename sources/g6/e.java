package g6;

import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements h, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f41580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f41581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41582d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e6.f f41583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f41584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile k6.q f41586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public File f41587i;

    public e(List list, i iVar, g gVar) {
        this.f41579a = list;
        this.f41580b = iVar;
        this.f41581c = gVar;
    }

    @Override // g6.h
    public final boolean a() {
        while (true) {
            List list = this.f41584f;
            boolean z10 = false;
            if (list != null && this.f41585g < list.size()) {
                this.f41586h = null;
                while (!z10 && this.f41585g < this.f41584f.size()) {
                    List list2 = this.f41584f;
                    int i10 = this.f41585g;
                    this.f41585g = i10 + 1;
                    k6.r rVar = (k6.r) list2.get(i10);
                    File file = this.f41587i;
                    i iVar = this.f41580b;
                    this.f41586h = rVar.b(file, iVar.f41601e, iVar.f41602f, iVar.f41605i);
                    if (this.f41586h != null && this.f41580b.c(this.f41586h.f44371c.a()) != null) {
                        this.f41586h.f44371c.d(this.f41580b.f41610o, this);
                        z10 = true;
                    }
                }
                return z10;
            }
            int i11 = this.f41582d + 1;
            this.f41582d = i11;
            if (i11 >= this.f41579a.size()) {
                return false;
            }
            e6.f fVar = (e6.f) this.f41579a.get(this.f41582d);
            i iVar2 = this.f41580b;
            File fileJ = iVar2.f41604h.a().j(new f(fVar, iVar2.f41609n));
            this.f41587i = fileJ;
            if (fileJ != null) {
                this.f41583e = fVar;
                this.f41584f = this.f41580b.f41599c.a().f(fileJ);
                this.f41585g = 0;
            }
        }
    }

    @Override // g6.h
    public final void cancel() {
        k6.q qVar = this.f41586h;
        if (qVar != null) {
            qVar.f44371c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void h(Exception exc) {
        this.f41581c.c(this.f41583e, exc, this.f41586h.f44371c, 3);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void z0(Object obj) {
        this.f41581c.b(this.f41583e, obj, this.f41586h.f44371c, 3, this.f41583e);
    }
}
