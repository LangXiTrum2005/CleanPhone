package ne;

import b0.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f46732b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(0);
        this.f46732b = i10;
    }

    @Override // ne.a
    public final int n(char c4, StringBuilder sb2) {
        switch (this.f46732b) {
            case 0:
                if (c4 == ' ') {
                    sb2.append((char) 3);
                    return 1;
                }
                if (c4 >= '0' && c4 <= '9') {
                    sb2.append((char) (c4 - ','));
                    return 1;
                }
                if (c4 >= 'a' && c4 <= 'z') {
                    sb2.append((char) (c4 - 'S'));
                    return 1;
                }
                if (c4 < ' ') {
                    sb2.append((char) 0);
                    sb2.append(c4);
                } else if (c4 >= '!' && c4 <= '/') {
                    sb2.append((char) 1);
                    sb2.append((char) (c4 - '!'));
                } else if (c4 >= ':' && c4 <= '@') {
                    sb2.append((char) 1);
                    sb2.append((char) (c4 - '+'));
                } else if (c4 >= '[' && c4 <= '_') {
                    sb2.append((char) 1);
                    sb2.append((char) (c4 - 'E'));
                } else if (c4 == '`') {
                    sb2.append((char) 2);
                    sb2.append((char) (c4 - '`'));
                } else if (c4 >= 'A' && c4 <= 'Z') {
                    sb2.append((char) 2);
                    sb2.append((char) (c4 - '@'));
                } else {
                    if (c4 < '{' || c4 > 127) {
                        sb2.append("\u0001\u001e");
                        return n((char) (c4 - 128), sb2) + 2;
                    }
                    sb2.append((char) 2);
                    sb2.append((char) (c4 - '`'));
                }
                return 2;
            default:
                if (c4 == '\r') {
                    sb2.append((char) 0);
                } else if (c4 == ' ') {
                    sb2.append((char) 3);
                } else if (c4 == '*') {
                    sb2.append((char) 1);
                } else if (c4 == '>') {
                    sb2.append((char) 2);
                } else if (c4 >= '0' && c4 <= '9') {
                    sb2.append((char) (c4 - ','));
                } else {
                    if (c4 < 'A' || c4 > 'Z') {
                        r9.b.n(c4);
                        throw null;
                    }
                    sb2.append((char) (c4 - '3'));
                }
                return 1;
        }
    }

    @Override // ne.a, ne.d
    public void o(n nVar) {
        switch (this.f46732b) {
            case 1:
                StringBuilder sb2 = new StringBuilder();
                while (nVar.b()) {
                    char cA = nVar.a();
                    nVar.f5154b++;
                    n(cA, sb2);
                    if (sb2.length() % 3 == 0) {
                        a.x(nVar, sb2);
                        if (r9.b.v(nVar.f5153a, nVar.f5154b, 3) != 3) {
                            nVar.f5155c = 0;
                            q(nVar, sb2);
                            break;
                        }
                    }
                }
                q(nVar, sb2);
                break;
            default:
                super.o(nVar);
                break;
        }
    }

    @Override // ne.a
    public final int p() {
        switch (this.f46732b) {
            case 0:
                return 2;
            default:
                return 3;
        }
    }

    @Override // ne.a
    public void q(n nVar, StringBuilder sb2) {
        switch (this.f46732b) {
            case 1:
                StringBuilder sb3 = (StringBuilder) nVar.f5158f;
                nVar.d(sb3.length());
                int length = ((f) nVar.f5159g).f46721b - sb3.length();
                nVar.f5154b -= sb2.length();
                String str = nVar.f5153a;
                if ((str.length() - nVar.f5156d) - nVar.f5154b > 1 || length > 1 || (str.length() - nVar.f5156d) - nVar.f5154b != length) {
                    nVar.e((char) 254);
                }
                if (nVar.f5155c < 0) {
                    nVar.f5155c = 0;
                }
                break;
            default:
                super.q(nVar, sb2);
                break;
        }
    }
}
