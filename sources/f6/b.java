package f6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.j;
import com.google.android.gms.internal.auth.o;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import k6.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparable f40673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f40674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f40675d;

    public /* synthetic */ b(int i10, Comparable comparable, Object obj) {
        this.f40672a = i10;
        this.f40673b = comparable;
        this.f40674c = obj;
    }

    public static b e(Context context, Uri uri, c cVar) {
        return new b(0, uri, new d(com.bumptech.glide.b.a(context).f10460d.a().e(), cVar, com.bumptech.glide.b.a(context).f10461e, context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f40672a) {
            case 0:
                return InputStream.class;
            case 1:
                ((a0) this.f40674c).getClass();
                return InputStream.class;
            default:
                return ((a0) this.f40674c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f40672a) {
            case 0:
                InputStream inputStream = (InputStream) this.f40675d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            case 1:
                try {
                    ((ByteArrayInputStream) this.f40675d).close();
                } catch (IOException unused2) {
                    return;
                }
                break;
            default:
                Object obj = this.f40675d;
                if (obj != null) {
                    try {
                        switch (((a0) this.f40674c).f44330a) {
                            case 8:
                                ((ParcelFileDescriptor) obj).close();
                                break;
                            default:
                                ((InputStream) obj).close();
                                break;
                        }
                    } catch (IOException unused3) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f40672a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f40672a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(f fVar, com.bumptech.glide.load.data.d dVar) throws Throwable {
        Object objOpen;
        switch (this.f40672a) {
            case 0:
                try {
                    InputStream inputStreamI = i();
                    this.f40675d = inputStreamI;
                    dVar.z0(inputStreamI);
                } catch (FileNotFoundException e10) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
                    }
                    dVar.h(e10);
                    return;
                }
                break;
            case 1:
                try {
                    ByteArrayInputStream byteArrayInputStreamA = a0.a((String) this.f40673b);
                    this.f40675d = byteArrayInputStreamA;
                    dVar.z0(byteArrayInputStreamA);
                } catch (IllegalArgumentException e11) {
                    dVar.h(e11);
                }
                break;
            default:
                try {
                    a0 a0Var = (a0) this.f40674c;
                    File file = (File) this.f40673b;
                    switch (a0Var.f44330a) {
                        case 8:
                            objOpen = ParcelFileDescriptor.open(file, 268435456);
                            break;
                        default:
                            objOpen = new FileInputStream(file);
                            break;
                    }
                    this.f40675d = objOpen;
                    dVar.z0(objOpen);
                } catch (FileNotFoundException e12) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e12);
                    }
                    dVar.h(e12);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0028: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:41), block:B:10:0x0028 */
    public InputStream i() throws Throwable {
        Cursor cursorA;
        Cursor cursor;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iL;
        d dVar = (d) this.f40674c;
        ContentResolver contentResolver = dVar.f40678c;
        Uri uri = (Uri) this.f40673b;
        Cursor cursor2 = null;
        inputStreamOpenInputStream = null;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                cursorA = dVar.f40676a.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            string = cursorA.getString(0);
                            cursorA.close();
                        }
                    } catch (SecurityException e10) {
                        e = e10;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            try {
                                try {
                                    inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                    iL = o.l(dVar.f40679d, inputStreamOpenInputStream2, dVar.f40677b);
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                } catch (IOException | NullPointerException e11) {
                                    if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                        Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e11);
                                    }
                                    if (inputStreamOpenInputStream2 != null) {
                                        try {
                                            inputStreamOpenInputStream2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    iL = -1;
                                }
                            } catch (Throwable th2) {
                                if (inputStreamOpenInputStream2 != null) {
                                    try {
                                        inputStreamOpenInputStream2.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw th2;
                            }
                        } else {
                            iL = -1;
                        }
                        if (iL != -1) {
                            return new j(inputStreamOpenInputStream, iL);
                        }
                        return inputStreamOpenInputStream;
                    }
                    if (TextUtils.isEmpty(string)) {
                        inputStreamOpenInputStream = null;
                    } else {
                        file = new File(string);
                        if (file.exists() || 0 >= file.length()) {
                            inputStreamOpenInputStream = null;
                        } else {
                            Uri uriFromFile = Uri.fromFile(file);
                            try {
                                inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            } catch (NullPointerException e12) {
                                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e12));
                            }
                        }
                    }
                    if (inputStreamOpenInputStream != null) {
                        inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                        iL = o.l(dVar.f40679d, inputStreamOpenInputStream2, dVar.f40677b);
                        if (inputStreamOpenInputStream2 != null) {
                            inputStreamOpenInputStream2.close();
                        }
                    } else {
                        iL = -1;
                    }
                    if (iL != -1) {
                        return new j(inputStreamOpenInputStream, iL);
                    }
                    return inputStreamOpenInputStream;
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            } catch (SecurityException e13) {
                e = e13;
                cursorA = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iL = o.l(dVar.f40679d, inputStreamOpenInputStream2, dVar.f40677b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iL = -1;
            }
            if (iL != -1) {
                return new j(inputStreamOpenInputStream, iL);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th4) {
            th = th4;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
