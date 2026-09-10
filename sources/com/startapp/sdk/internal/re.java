package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class re {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41445a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yj f41446b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f41447c = null;

    public final String a(Context context, URL url, String str, hj hjVar) {
        InputStream inputStream;
        File file;
        DataInputStream dataInputStream;
        FileOutputStream fileOutputStreamOpenFileOutput;
        int i2;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        this.f41447c = url.toString();
        this.f41445a = true;
        try {
            int iK = AdsCommonMetaData.k().F().k();
            String str2 = context.getFilesDir() + "/" + str;
            File file2 = new File(str2);
            if (file2.exists()) {
                this.f41447c = null;
                WeakHashMap weakHashMap = vi.f41589a;
                return str2;
            }
            String str3 = str + ".temp";
            String str4 = str2 + ".temp";
            file = new File(context.getFilesDir() + "/" + str3);
            try {
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.connect();
                int contentLength = uRLConnectionOpenConnection.getContentLength();
                inputStream = uRLConnectionOpenConnection.getInputStream();
                try {
                    dataInputStream = new DataInputStream(inputStream);
                    try {
                        byte[] bArr = new byte[4096];
                        int i3 = 0;
                        fileOutputStreamOpenFileOutput = context.openFileOutput(str3, 0);
                        int i4 = 0;
                        boolean z2 = false;
                        int i5 = 0;
                        while (true) {
                            try {
                                i2 = dataInputStream.read(bArr);
                                if (i2 <= 0 || !this.f41445a) {
                                    break;
                                }
                                fileOutputStreamOpenFileOutput.write(bArr, i3, i2);
                                i4 += i2;
                                fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                                int i6 = (int) ((((double) i4) * 100.0d) / ((double) contentLength));
                                if (i6 >= iK) {
                                    if (!z2) {
                                        try {
                                            new Handler(Looper.getMainLooper()).post(new ne(hjVar, str4));
                                            z2 = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            fileOutputStreamOpenFileOutput = fileOutputStreamOpenFileOutput;
                                        }
                                    }
                                    if (i6 >= i5 + 1) {
                                        if (this.f41446b != null) {
                                            new Handler(Looper.getMainLooper()).post(new oe(this, i6));
                                        }
                                        i5 = i6;
                                    }
                                    i3 = 0;
                                }
                                i3 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        FileOutputStream fileOutputStream2 = fileOutputStreamOpenFileOutput;
                        if (!this.f41445a && i2 > 0) {
                            file.delete();
                            this.f41447c = null;
                            vi.a(inputStream);
                            vi.a(dataInputStream);
                            vi.a(fileOutputStream2);
                            return "downloadInterrupted";
                        }
                        try {
                            try {
                                fileInputStream = new FileInputStream(file);
                                try {
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        byte[] bArr2 = new byte[1024];
                                        while (true) {
                                            int i7 = fileInputStream.read(bArr2);
                                            if (i7 <= 0) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr2, 0, i7);
                                        }
                                        fileInputStream.close();
                                    } catch (Exception unused) {
                                        fileInputStream.close();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            fileInputStream.close();
                                            fileOutputStream.close();
                                        } catch (Exception unused2) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception unused3) {
                                    fileOutputStream = null;
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                    this.f41447c = null;
                                    vi.a(inputStream);
                                    vi.a(dataInputStream);
                                    vi.a(fileOutputStream2);
                                    return str2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                    throw th;
                                }
                            } catch (Exception unused4) {
                                fileInputStream = null;
                            } catch (Throwable th5) {
                                th = th5;
                                fileInputStream = null;
                            }
                            fileOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        this.f41447c = null;
                        vi.a(inputStream);
                        vi.a(dataInputStream);
                        vi.a(fileOutputStream2);
                        return str2;
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStreamOpenFileOutput = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    dataInputStream = null;
                }
            } catch (Throwable th8) {
                th = th8;
                inputStream = null;
            }
        } catch (Throwable th9) {
            th = th9;
            inputStream = null;
            file = null;
        }
        dataInputStream = null;
        fileOutputStreamOpenFileOutput = null;
        if (file != null) {
            try {
                file.delete();
            } finally {
                this.f41447c = null;
                vi.a(inputStream);
                vi.a(dataInputStream);
                vi.a(fileOutputStreamOpenFileOutput);
            }
        }
        if (!(th instanceof IOException) && !(th instanceof OutOfMemoryError)) {
            g9.a(th);
        }
        return null;
    }
}
