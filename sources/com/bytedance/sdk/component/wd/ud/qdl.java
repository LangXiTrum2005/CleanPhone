package com.bytedance.sdk.component.wd.ud;

import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.ud.qdl.fs;
import com.bytedance.sdk.component.ud.qdl.mo;
import com.bytedance.sdk.component.ud.qdl.rdp;
import com.bytedance.sdk.component.ud.qdl.rq;
import com.inmobi.unification.sdk.InitializationStatus;
import com.mbridge.msdk.foundation.download.Command;
import com.smartdigimkt.o0.b;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class qdl extends lnr {
    public File qdl;
    private volatile boolean to;
    public File ud;

    public qdl(rq rqVar) {
        super(rqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long mo(Map<String, String> map) {
        String str;
        if (map.containsKey("content-length")) {
            str = map.get("content-length");
        } else {
            str = map.containsKey("Content-Length") ? map.get("Content-Length") : null;
        }
        if (!TextUtils.isEmpty(str) && str != null) {
            try {
                return Long.valueOf(str).longValue();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean mzz(Map<String, String> map) {
        if (TextUtils.equals(map.get("Accept-Ranges"), "bytes") || TextUtils.equals(map.get("accept-ranges"), "bytes")) {
            return true;
        }
        String str = map.get("Content-Range");
        if (TextUtils.isEmpty(str)) {
            str = map.get("content-range");
        }
        return str != null && str.startsWith("bytes");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean wd(Map<String, String> map) {
        return TextUtils.equals(map.get("Content-Encoding"), b.d);
    }

    public void qdl(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        this.qdl = new File(str, str2);
        this.ud = new File(str, a.m(str2, ".temp"));
    }

    @Override // com.bytedance.sdk.component.wd.ud.lnr
    public void ud() {
        this.to = true;
        super.ud();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mzz() {
        try {
            this.qdl.delete();
        } catch (Throwable unused) {
        }
        try {
            this.ud.delete();
        } catch (Throwable unused2) {
        }
    }

    public void qdl(final com.bytedance.sdk.component.wd.qdl.qdl qdlVar) {
        File file = this.qdl;
        if (file == null || this.ud == null) {
            if (qdlVar != null) {
                qdlVar.qdl(this, new IOException("File info is null, please exec setFileInfo(String dir, String fileName)"));
                return;
            }
            return;
        }
        if (file.exists() && this.qdl.length() != 0 && qdlVar != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.wd.ud udVar = new com.bytedance.sdk.component.wd.ud(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            udVar.qdl(this.qdl);
            qdlVar.qdl(this, udVar);
            return;
        }
        long length = this.ud.length();
        final long j = length >= 0 ? length : 0L;
        fs.qdl qdlVar2 = new fs.qdl();
        qdlVar2.qdl((Object) lnr());
        ud(Command.HTTP_HEADER_RANGE, "bytes=" + j + TokenBuilder.TOKEN_DELIMITER);
        if (TextUtils.isEmpty(this.jpc)) {
            qdlVar.qdl(this, new IOException("Url is Empty"));
            return;
        }
        try {
            qdlVar2.ud(this.jpc);
            if (!TextUtils.isEmpty(this.mzz)) {
                qdlVar2.qdl(this.mzz);
            }
            int i2 = this.mo;
            if (i2 > 0) {
                qdlVar2.qdl(i2);
            }
            qdl(qdlVar2);
            com.bytedance.sdk.component.ud.qdl.ud udVarQdl = this.lnr.qdl(qdlVar2.qdl().ud());
            if (udVarQdl == null) {
                qdlVar.qdl(this, new IOException("new call error"));
            } else {
                udVarQdl.qdl(new com.bytedance.sdk.component.ud.qdl.lnr() { // from class: com.bytedance.sdk.component.wd.ud.qdl.1
                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar2, IOException iOException) {
                        com.bytedance.sdk.component.wd.qdl.qdl qdlVar3 = qdlVar;
                        if (qdlVar3 != null) {
                            qdlVar3.qdl(qdl.this, iOException);
                        }
                        qdl.this.mzz();
                    }

                    @Override // com.bytedance.sdk.component.ud.qdl.lnr
                    public void qdl(com.bytedance.sdk.component.ud.qdl.ud udVar2, rdp rdpVar) throws IOException {
                        RandomAccessFile randomAccessFile;
                        long j2;
                        byte[] bArr;
                        long j3;
                        int i3;
                        if (qdlVar != null) {
                            HashMap map = new HashMap();
                            if (rdpVar != null) {
                                mo moVarWd = rdpVar.wd();
                                if (moVarWd != null) {
                                    for (int i4 = 0; i4 < moVarWd.qdl(); i4++) {
                                        map.put(moVarWd.qdl(i4), moVarWd.ud(i4));
                                    }
                                }
                                com.bytedance.sdk.component.wd.ud udVar3 = new com.bytedance.sdk.component.wd.ud(rdpVar.mml(), rdpVar.lnr(), rdpVar.mzz(), map, null, rdpVar.ud(), rdpVar.qdl());
                                if (rdpVar.mml()) {
                                    long jQdl = rdpVar.mo().qdl();
                                    long j4 = 0;
                                    if (jQdl <= 0) {
                                        jQdl = qdl.mo(map);
                                    }
                                    boolean zMzz = qdl.mzz(map);
                                    if (zMzz) {
                                        jQdl += j;
                                        String str = (String) map.get("Content-Range");
                                        if (!TextUtils.isEmpty(str)) {
                                            String str2 = "bytes " + j + TokenBuilder.TOKEN_DELIMITER + (jQdl - 1);
                                            if (TextUtils.indexOf(str, str2) == -1) {
                                                qdl.this.mzz();
                                                com.bytedance.sdk.component.wd.qdl.qdl qdlVar3 = qdlVar;
                                                qdl qdlVar4 = qdl.this;
                                                StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("The Content-Range Header is invalid Assume[", str2, "] vs Real[", str, "], please remove the temporary file [");
                                                sbQ.append(qdl.this.ud);
                                                sbQ.append("].");
                                                qdlVar3.qdl(qdlVar4, new IOException(sbQ.toString()));
                                                return;
                                            }
                                        }
                                    }
                                    if (jQdl > 0 && qdl.this.ud.exists() && qdl.this.ud.length() == jQdl) {
                                        qdl qdlVar5 = qdl.this;
                                        if (!qdlVar5.ud.renameTo(qdlVar5.qdl)) {
                                            qdlVar.qdl(qdl.this, new IOException("Rename fail"));
                                            return;
                                        } else {
                                            udVar3.qdl(qdl.this.qdl);
                                            qdlVar.qdl(qdl.this, udVar3);
                                            return;
                                        }
                                    }
                                    InputStream inputStreamLnr = null;
                                    try {
                                        try {
                                            try {
                                                try {
                                                    randomAccessFile = new RandomAccessFile(qdl.this.ud, "rw");
                                                    try {
                                                        if (zMzz) {
                                                            randomAccessFile.seek(j);
                                                            j2 = j;
                                                        } else {
                                                            randomAccessFile.setLength(0L);
                                                            j2 = 0;
                                                        }
                                                        while (true) {
                                                            long j5 = j4;
                                                            int i5 = inputStreamLnr.read(bArr, i3, 16384 - i3);
                                                            if (i5 != -1) {
                                                                i3 += i5;
                                                                j3 += (long) i5;
                                                                if (j3 % 16384 == j5 || j3 == jQdl - j) {
                                                                    randomAccessFile.seek(j2);
                                                                    randomAccessFile.write(bArr, 0, i3);
                                                                    j2 += (long) i3;
                                                                    i3 = 0;
                                                                }
                                                                if (qdl.this.to) {
                                                                    throw new IOException("net is cancel");
                                                                }
                                                                j4 = j5;
                                                            } else {
                                                                if (i3 != 0) {
                                                                    randomAccessFile.seek(j2);
                                                                    randomAccessFile.write(bArr, 0, i3);
                                                                }
                                                                if (!zMzz) {
                                                                    jQdl = qdl.this.ud.length();
                                                                }
                                                                if (jQdl > j5 && qdl.this.ud.exists() && qdl.this.ud.length() == jQdl) {
                                                                    qdl qdlVar6 = qdl.this;
                                                                    if (!qdlVar6.ud.renameTo(qdlVar6.qdl)) {
                                                                        qdlVar.qdl(qdl.this, new IOException("Rename fail"));
                                                                        break;
                                                                    } else {
                                                                        udVar3.qdl(qdl.this.qdl);
                                                                        qdlVar.qdl(qdl.this, udVar3);
                                                                        break;
                                                                    }
                                                                }
                                                                com.bytedance.sdk.component.wd.qdl.qdl qdlVar7 = qdlVar;
                                                                qdl qdlVar8 = qdl.this;
                                                                StringBuilder sb = new StringBuilder(" tempFile.length() == fileSize is");
                                                                sb.append(qdl.this.ud.length() == jQdl);
                                                                qdlVar7.qdl(qdlVar8, new IOException(sb.toString()));
                                                                break;
                                                            }
                                                        }
                                                    } catch (Throwable unused) {
                                                    }
                                                } catch (Throwable unused2) {
                                                    randomAccessFile = null;
                                                }
                                                inputStreamLnr = rdpVar.mo().lnr();
                                                if (qdl.wd(map) && !(inputStreamLnr instanceof GZIPInputStream)) {
                                                    inputStreamLnr = new GZIPInputStream(inputStreamLnr);
                                                }
                                                bArr = new byte[16384];
                                                j3 = 0;
                                                i3 = 0;
                                            } catch (Throwable th) {
                                                try {
                                                    qdlVar.qdl(qdl.this, new IOException(th.getMessage()));
                                                    if (!zMzz) {
                                                        qdl.this.mzz();
                                                    }
                                                    if (inputStreamLnr != null) {
                                                        break;
                                                    }
                                                    return;
                                                } finally {
                                                    if (0 != 0) {
                                                        try {
                                                            inputStreamLnr.close();
                                                        } catch (Throwable unused3) {
                                                        }
                                                    }
                                                    try {
                                                        randomAccessFile.close();
                                                    } catch (Throwable unused4) {
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused5) {
                                        }
                                        return;
                                    } catch (Throwable unused6) {
                                        return;
                                    }
                                }
                                qdlVar.qdl(qdl.this, udVar3);
                            }
                        }
                    }
                });
            }
        } catch (IllegalArgumentException unused) {
            qdlVar.qdl(this, new IOException("Url is not a valid HTTP or HTTPS URL"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0133 A[PHI: r10
  0x0133: PHI (r10v4 long) = (r10v3 long), (r10v8 long) binds: [B:41:0x00f9, B:44:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    public com.bytedance.sdk.component.wd.ud qdl() {
        com.bytedance.sdk.component.wd.ud udVar;
        RandomAccessFile randomAccessFile;
        long j;
        InputStream inputStream;
        qdl qdlVar = this;
        File file = qdlVar.qdl;
        if (file == null || qdlVar.ud == null) {
            return null;
        }
        if (file.exists() && qdlVar.qdl.length() != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.wd.ud udVar2 = new com.bytedance.sdk.component.wd.ud(true, 200, InitializationStatus.SUCCESS, null, null, jCurrentTimeMillis, jCurrentTimeMillis);
            udVar2.qdl(qdlVar.qdl);
            return udVar2;
        }
        long length = qdlVar.ud.length();
        if (length < 0) {
            length = 0;
        }
        fs.qdl qdlVar2 = new fs.qdl();
        qdlVar2.qdl((Object) qdlVar.lnr());
        qdlVar.ud(Command.HTTP_HEADER_RANGE, "bytes=" + length + TokenBuilder.TOKEN_DELIMITER);
        if (TextUtils.isEmpty(qdlVar.jpc)) {
            Log.e("DownloadExecutor", "execute: Url is Empty");
            return null;
        }
        try {
            qdlVar2.ud(qdlVar.jpc);
            qdlVar.qdl(qdlVar2);
            try {
                com.bytedance.sdk.component.ud.qdl.ud udVarQdl = qdlVar.lnr.qdl(qdlVar2.qdl().ud());
                if (udVarQdl == null) {
                    return null;
                }
                rdp rdpVarUd = udVarQdl.ud();
                if (rdpVarUd == null || !rdpVarUd.mml()) {
                    return null;
                }
                HashMap map = new HashMap();
                mo moVarWd = rdpVarUd.wd();
                if (moVarWd != null) {
                    for (int i2 = 0; i2 < moVarWd.qdl(); i2++) {
                        map.put(moVarWd.qdl(i2), moVarWd.ud(i2));
                    }
                }
                com.bytedance.sdk.component.wd.ud udVar3 = new com.bytedance.sdk.component.wd.ud(rdpVarUd.mml(), rdpVarUd.lnr(), rdpVarUd.mzz(), map, null, rdpVarUd.ud(), rdpVarUd.qdl());
                long jQdl = rdpVarUd.mo().qdl();
                if (jQdl <= 0) {
                    jQdl = mo(map);
                }
                long length2 = qdlVar.ud.length();
                boolean zMzz = mzz(map);
                udVar = null;
                if (zMzz) {
                    jQdl += length2;
                    try {
                        String str = (String) map.get("Content-Range");
                        if (!TextUtils.isEmpty(str)) {
                            if (TextUtils.indexOf(str, "bytes " + length2 + TokenBuilder.TOKEN_DELIMITER + (jQdl - 1)) == -1) {
                                Objects.toString(qdlVar.ud);
                                qdlVar.mzz();
                                return null;
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
                if (jQdl > r3 && qdlVar.ud.exists() && qdlVar.ud.length() == jQdl) {
                    if (!qdlVar.ud.renameTo(qdlVar.qdl)) {
                        return null;
                    }
                    udVar3.qdl(qdlVar.qdl);
                    return udVar3;
                }
                try {
                    randomAccessFile = new RandomAccessFile(qdlVar.ud, "rw");
                    try {
                        if (zMzz) {
                            randomAccessFile.seek(length);
                            j = length;
                        } else {
                            randomAccessFile.setLength(0L);
                            j = 0;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    randomAccessFile = null;
                }
                try {
                    InputStream inputStreamLnr = rdpVarUd.mo().lnr();
                    try {
                        if (wd(map) && !(inputStreamLnr instanceof GZIPInputStream)) {
                            inputStreamLnr = new GZIPInputStream(inputStreamLnr);
                        }
                        byte[] bArr = new byte[16384];
                        int i3 = 0;
                        long j2 = 0;
                        while (true) {
                            int i4 = inputStreamLnr.read(bArr, i3, 16384 - i3);
                            inputStream = inputStreamLnr;
                            if (i4 != -1) {
                                i3 += i4;
                                j2 += (long) i4;
                                try {
                                    if (j2 % 16384 == 0 || j2 == jQdl - length) {
                                        randomAccessFile.seek(j);
                                        randomAccessFile.write(bArr, 0, i3);
                                        j += (long) i3;
                                        i3 = 0;
                                    }
                                    qdlVar = this;
                                    try {
                                        if (qdlVar.to) {
                                            throw new IOException("net is cancel");
                                        }
                                        inputStreamLnr = inputStream;
                                    } catch (Throwable unused4) {
                                        if (!zMzz) {
                                            try {
                                                qdlVar.mzz();
                                            } finally {
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (Throwable unused5) {
                                                    }
                                                }
                                                try {
                                                    randomAccessFile.close();
                                                } catch (Throwable unused6) {
                                                }
                                            }
                                        }
                                        return null;
                                    }
                                } catch (Throwable unused7) {
                                    qdlVar = this;
                                }
                            } else {
                                if (i4 != 0) {
                                    randomAccessFile.seek(j);
                                    randomAccessFile.write(bArr, 0, i3);
                                }
                                if (!zMzz || length == 0) {
                                    jQdl = qdlVar.ud.length();
                                }
                                if (jQdl > 0 && qdlVar.ud.exists() && qdlVar.ud.length() == jQdl) {
                                    if (qdlVar.ud.renameTo(qdlVar.qdl)) {
                                        udVar3.qdl(qdlVar.qdl);
                                        try {
                                            inputStream.close();
                                        } catch (Throwable unused8) {
                                        }
                                        try {
                                            randomAccessFile.close();
                                        } catch (Throwable unused9) {
                                        }
                                        return udVar3;
                                    }
                                    try {
                                        inputStream.close();
                                    } catch (Throwable unused10) {
                                    }
                                    try {
                                        randomAccessFile.close();
                                    } catch (Throwable unused11) {
                                    }
                                    return null;
                                }
                                qdlVar.ud.length();
                                try {
                                    inputStream.close();
                                } catch (Throwable unused12) {
                                }
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused13) {
                                }
                                return null;
                            }
                        }
                    } catch (Throwable unused14) {
                        inputStream = inputStreamLnr;
                    }
                } catch (Throwable unused15) {
                    inputStream = null;
                }
            } catch (IOException unused16) {
                udVar = null;
            }
            qdlVar.mzz();
            return udVar;
        } catch (IllegalArgumentException unused17) {
            Log.e("DownloadExecutor", "execute: Url is not a valid HTTP or HTTPS URL");
            return null;
        }
    }
}
