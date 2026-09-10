package jj;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.webkit.MimeTypeMap;
import bc.s;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import ea.f2;
import i1.p;
import j9.o;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.KeyAgreement;
import kotlin.jvm.internal.n;
import l7.h0;
import m0.s1;
import n2.a0;
import n2.t;
import n6.b0;
import n6.c0;
import oa.j0;
import org.json.JSONObject;
import q7.d0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements j2.j, k3.k, k9.l, kb.j, k4.a, l7.e, d0, lg.a, mg.a, n2.m, n6.m, c0, ne.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43937a;

    public /* synthetic */ d(int i10) {
        this.f43937a = i10;
    }

    public static String[] A(Context context, String str) {
        StringBuilder sb2 = new StringBuilder("lib");
        char c4 = File.separatorChar;
        sb2.append(c4);
        sb2.append("([^\\");
        sb2.append(c4);
        sb2.append("]*)");
        sb2.append(c4);
        sb2.append(str);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : D(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static File B(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String C(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String[] strArrSplit = str.split("/");
        String strReplace = strArrSplit[strArrSplit.length - 1];
        for (int i10 = 0; i10 < 2; i10++) {
            strReplace = strReplace.replace(strArr[i10], "_");
        }
        return strReplace;
    }

    public static String[] D(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    public static void r(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static lo.h s(String str) {
        n.f(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (mo.b.a(str.charAt(i11 + 1)) + (mo.b.a(str.charAt(i11)) << 4));
        }
        return new lo.h(bArr);
    }

    public static byte[] t(long j10, j0 j0Var) {
        d2.c cVar = new d2.c(10);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(j0Var.size());
        Iterator<E> it = j0Var.iterator();
        while (it.hasNext()) {
            arrayList.add((Bundle) cVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, j10);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static lo.h v(String str) {
        n.f(str, "<this>");
        byte[] bytes = str.getBytes(an.a.f3768a);
        n.e(bytes, "this as java.lang.String).getBytes(charset)");
        lo.h hVar = new lo.h(bytes);
        hVar.f45641c = str;
        return hVar;
    }

    public static s1 w(Context context, String[] strArr, String str, k5.g gVar) {
        String[] strArrD = D(context);
        int length = strArrD.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str2 = strArrD[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb2 = new StringBuilder("lib");
                            char c4 = File.separatorChar;
                            sb2.append(c4);
                            sb2.append(str3);
                            sb2.append(c4);
                            sb2.append(str);
                            String string = sb2.toString();
                            gVar.s("Looking for %s in APK %s...", string, str2);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                s1 s1Var = new s1(4, false);
                                s1Var.f45751b = zipFile;
                                s1Var.f45752c = entry;
                                return s1Var;
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    public static String y(Context context, Uri uri) {
        try {
            String extensionFromMimeType = uri.getScheme().equals("content") ? MimeTypeMap.getSingleton().getExtensionFromMimeType(context.getContentResolver().getType(uri)) : MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            if (extensionFromMimeType == null || extensionFromMimeType.isEmpty()) {
                return null;
            }
            return "." + C(extensionFromMimeType);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0061 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:4:0x000d, B:13:0x004f, B:26:0x0065, B:28:0x006b, B:33:0x0084, B:40:0x00a7, B:47:0x00d3, B:57:0x00e5, B:56:0x00e2, B:35:0x008b, B:39:0x009d, B:38:0x0099, B:24:0x0061, B:22:0x005e, B:21:0x005b, B:52:0x00dc, B:7:0x0039, B:9:0x003f, B:12:0x0047, B:17:0x0055, B:42:0x00bf, B:43:0x00c1, B:45:0x00c8, B:46:0x00cc), top: B:68:0x000d, inners: #0, #2, #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:? A[Catch: IOException | IllegalArgumentException | SecurityException -> 0x00f2, IOException | IllegalArgumentException | SecurityException -> 0x00f2, IOException | IllegalArgumentException | SecurityException -> 0x00f2, SYNTHETIC, TRY_LEAVE, TryCatch #6 {IOException | IllegalArgumentException | SecurityException -> 0x00f2, blocks: (B:3:0x0005, B:48:0x00d6, B:48:0x00d6, B:48:0x00d6, B:64:0x00f1, B:64:0x00f1, B:64:0x00f1, B:63:0x00ee, B:63:0x00ee, B:63:0x00ee), top: B:77:0x0005 }] */
    public static String z(Context context, Uri uri) {
        String strC;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File file = new File(context.getCacheDir(), UUID.randomUUID().toString());
                file.mkdir();
                file.deleteOnExit();
                Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (!cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 1) {
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            strC = null;
                        } else {
                            strC = C(cursorQuery.getString(0));
                            cursorQuery.close();
                        }
                    } catch (Throwable th2) {
                        try {
                            cursorQuery.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } else {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    strC = null;
                }
                String strY = y(context, uri);
                if (strC == null) {
                    Log.w("FileUtils", "Cannot get file name for " + uri);
                    if (strY == null) {
                        strY = ".jpg";
                    }
                    strC = "image_picker".concat(strY);
                } else if (strY != null) {
                    StringBuilder sb2 = new StringBuilder();
                    int iLastIndexOf = strC.lastIndexOf(46);
                    if (iLastIndexOf >= 0) {
                        strC = strC.substring(0, iLastIndexOf);
                    }
                    sb2.append(strC);
                    sb2.append(strY);
                    strC = sb2.toString();
                }
                File fileB = B(new File(file, strC).getPath(), file.getCanonicalPath());
                FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = inputStreamOpenInputStream.read(bArr);
                        if (i10 == -1) {
                            fileOutputStream.flush();
                            String path = fileB.getPath();
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return path;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                        if (inputStreamOpenInputStream != null) {
                            throw th;
                        }
                        try {
                            inputStreamOpenInputStream.close();
                            throw th;
                        } catch (Throwable th4) {
                            th.addSuppressed(th4);
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        fileOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (inputStreamOpenInputStream != null) {
                    throw th7;
                }
                inputStreamOpenInputStream.close();
                throw th7;
            }
        } catch (IOException | IllegalArgumentException | SecurityException unused) {
            return null;
        }
    }

    @Override // k3.k
    public boolean a(p pVar) {
        return false;
    }

    @Override // kb.j
    public Object c(String str, Provider provider) {
        switch (this.f43937a) {
            case 5:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 6:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            default:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
        }
    }

    @Override // k9.l
    public /* bridge */ /* synthetic */ Object d(o oVar) {
        return null;
    }

    @Override // lg.a
    public void e(ShortBuffer shortBuffer, ShortBuffer shortBuffer2, int i10) {
        switch (this.f43937a) {
            case 16:
                if (shortBuffer.remaining() < shortBuffer2.remaining()) {
                    throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
                }
                int iRemaining = shortBuffer.remaining() - shortBuffer2.remaining();
                shortBuffer.limit(shortBuffer.limit() - iRemaining);
                shortBuffer2.put(shortBuffer);
                shortBuffer.limit(shortBuffer.limit() + iRemaining);
                shortBuffer.position(shortBuffer.limit());
                return;
            default:
                if (shortBuffer.remaining() > shortBuffer2.remaining()) {
                    throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
                }
                shortBuffer2.put(shortBuffer);
                return;
        }
    }

    @Override // n2.m
    public void endTracks() {
        throw new UnsupportedOperationException();
    }

    @Override // l7.e
    public String f() {
        return "fb_extend_sso_token";
    }

    @Override // k3.k
    public k3.m g(p pVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // k3.k
    public int h(p pVar) {
        return 1;
    }

    @Override // q7.d0
    public void i(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("id") : null;
        if (strOptString == null) {
            Log.w("h0", "No user ID returned on Me request");
            return;
        }
        String strOptString2 = jSONObject.optString("link");
        String strOptString3 = jSONObject.optString("profile_picture", null);
        l7.j0.f45174d.v().a(new h0(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null, strOptString3 != null ? Uri.parse(strOptString3) : null), true);
    }

    @Override // q7.d0
    public void j(l7.n nVar) {
        Log.e("h0", "Got unexpected exception: " + nVar);
    }

    @Override // n6.c0
    public void k(MediaExtractor mediaExtractor, Object obj) throws IOException {
        switch (this.f43937a) {
            case 27:
                mediaExtractor.setDataSource(new b0((ByteBuffer) obj, 0));
                break;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // j2.j
    public void load() {
        synchronized (k2.b.f44264a) {
            Object obj = k2.b.f44265b;
            synchronized (obj) {
                if (k2.b.f44266c) {
                    return;
                }
                long jA = k2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    k2.b.f44267d = jA;
                    k2.b.f44266c = true;
                }
            }
        }
    }

    @Override // k4.a
    public k4.b n(s sVar) {
        return new l4.e((Context) sVar.f5581b, (String) sVar.f5582c, (f2) sVar.f5583d, sVar.f5580a);
    }

    @Override // ne.d
    public void o(b0.n nVar) {
        StringBuilder sb2;
        StringBuilder sb3 = new StringBuilder();
        sb3.append((char) 0);
        while (true) {
            boolean zB = nVar.b();
            sb2 = (StringBuilder) nVar.f5158f;
            if (!zB) {
                break;
            }
            sb3.append(nVar.a());
            int i10 = nVar.f5154b + 1;
            nVar.f5154b = i10;
            if (r9.b.v(nVar.f5153a, i10, 5) != 5) {
                nVar.f5155c = 0;
                break;
            }
        }
        int length = sb3.length() - 1;
        int length2 = sb2.length() + length + 1;
        nVar.d(length2);
        boolean z10 = ((ne.f) nVar.f5159g).f46721b - length2 > 0;
        if (nVar.b() || z10) {
            if (length <= 249) {
                sb3.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb3.setCharAt(0, (char) ((length / 250) + 249));
                sb3.insert(1, (char) (length % 250));
            }
        }
        int length3 = sb3.length();
        for (int i11 = 0; i11 < length3; i11++) {
            int length4 = (((sb2.length() + 1) * 149) % 255) + 1 + sb3.charAt(i11);
            if (length4 > 255) {
                length4 -= 256;
            }
            nVar.e((char) length4);
        }
    }

    @Override // l7.e
    public String p() {
        return "oauth/access_token";
    }

    @Override // n6.c0
    public void q(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.f43937a) {
            case 27:
                mediaMetadataRetriever.setDataSource(new b0((ByteBuffer) obj, 0));
                break;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                break;
        }
    }

    @Override // n2.m
    public a0 track(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // n2.m
    public void u(t tVar) {
        throw new UnsupportedOperationException();
    }

    public synchronized q7.j x() {
        r rVarB = u.b(l7.s.c());
        if (rVarB == null) {
            return q7.j.f48701d.i();
        }
        return rVarB.f48761e;
    }

    @Override // j2.j
    public void cancelLoad() {
    }

    @Override // n6.m
    public void l() {
    }

    @Override // mg.a
    public long b(vf.c cVar, long j10) {
        return j10;
    }

    @Override // n6.m
    public void m(Bitmap bitmap, h6.a aVar) {
    }
}
