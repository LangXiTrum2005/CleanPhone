package k6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f44361d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f44363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44364c;

    public /* synthetic */ m(int i10, Object obj, Object obj2) {
        this.f44362a = i10;
        this.f44363b = obj;
        this.f44364c = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f44362a) {
            case 0:
                return File.class;
            default:
                return ((a0) this.f44364c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        int i10 = this.f44362a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f44362a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f44362a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        Object objWrap;
        switch (this.f44362a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f44363b).getContentResolver().query((Uri) this.f44364c, f44361d, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    dVar.z0(new File(string));
                    return;
                }
                dVar.h(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f44364c)));
                return;
            default:
                a0 a0Var = (a0) this.f44364c;
                byte[] bArr = (byte[]) this.f44363b;
                switch (a0Var.f44330a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.z0(objWrap);
                return;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
