package g6;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Appendable f41701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f41702b = true;

    public v(Appendable appendable) {
        this.f41701a = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c4) throws IOException {
        boolean z10 = this.f41702b;
        Appendable appendable = this.f41701a;
        if (z10) {
            this.f41702b = false;
            appendable.append("  ");
        }
        this.f41702b = c4 == '\n';
        appendable.append(c4);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z10 = this.f41702b;
        Appendable appendable = this.f41701a;
        boolean z11 = false;
        if (z10) {
            this.f41702b = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i11 - 1) == '\n') {
            z11 = true;
        }
        this.f41702b = z11;
        appendable.append(charSequence, i10, i11);
        return this;
    }
}
