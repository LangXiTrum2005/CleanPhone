package ae;

import android.util.Log;
import com.google.android.gms.internal.ads.or1;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f3542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f3543c;

    public t() {
        this.f3541a = 1;
        this.f3542b = new StringBuilder(128);
        this.f3543c = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f3541a) {
            case 0:
                this.f3542b.append(charSequence);
                return this;
            case 1:
            default:
                return super.append(charSequence);
            case 2:
                this.f3542b.append(charSequence);
                return this;
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3541a) {
            case 1:
                o();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f3541a) {
            case 1:
                o();
                break;
        }
    }

    public void o() {
        StringBuilder sb2 = this.f3542b;
        if (sb2.length() > 0) {
            Log.d((String) this.f3543c, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        switch (this.f3541a) {
            case 0:
                this.f3542b.append((char) i10);
                break;
            case 1:
            default:
                super.write(i10);
                break;
            case 2:
                this.f3542b.append((char) i10);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.f3541a) {
            case 0:
                this.f3542b.append(charSequence);
                return this;
            case 1:
            default:
                return super.append(charSequence);
            case 2:
                append(charSequence);
                return this;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        switch (this.f3541a) {
            case 0:
                Objects.requireNonNull(str);
                this.f3542b.append((CharSequence) str, i10, i11 + i10);
                break;
            case 1:
            default:
                super.write(str, i10, i11);
                break;
            case 2:
                Objects.requireNonNull(str);
                this.f3542b.append((CharSequence) str, i10, i11 + i10);
                break;
        }
    }

    public t(StringBuilder sb2, int i10) {
        this.f3541a = i10;
        switch (i10) {
            case 2:
                this.f3543c = new or1();
                this.f3542b = sb2;
                break;
            default:
                this.f3543c = new s();
                this.f3542b = sb2;
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        switch (this.f3541a) {
            case 0:
                this.f3542b.append(charSequence, i10, i11);
                return this;
            case 1:
            default:
                return super.append(charSequence, i10, i11);
            case 2:
                this.f3542b.append(charSequence, i10, i11);
                return this;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) {
        switch (this.f3541a) {
            case 0:
                this.f3542b.append(charSequence, i10, i11);
                return this;
            case 1:
            default:
                return super.append(charSequence, i10, i11);
            case 2:
                append(charSequence, i10, i11);
                return this;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        switch (this.f3541a) {
            case 0:
                s sVar = (s) this.f3543c;
                sVar.f3539a = cArr;
                sVar.f3540b = null;
                this.f3542b.append((CharSequence) sVar, i10, i11 + i10);
                break;
            case 1:
                for (int i12 = 0; i12 < i11; i12++) {
                    char c4 = cArr[i10 + i12];
                    if (c4 == '\n') {
                        o();
                    } else {
                        this.f3542b.append(c4);
                    }
                }
                break;
            default:
                or1 or1Var = (or1) this.f3543c;
                or1Var.f18350a = cArr;
                or1Var.f18351b = null;
                this.f3542b.append((CharSequence) or1Var, i10, i11 + i10);
                break;
        }
    }

    private final void d() {
    }

    private final void h() {
    }

    private final void k() {
    }

    private final void n() {
    }
}
