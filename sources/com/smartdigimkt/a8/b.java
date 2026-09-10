package com.smartdigimkt.a8;

import android.os.Build;
import com.smartdigimkt.z7.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes5.dex */
public class b extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f33785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f33786b;

    public b(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.f33785a = httpURLConnection;
        this.f33786b = inputStream;
    }

    @Override // com.smartdigimkt.z7.k
    public long a() {
        try {
            InputStream inputStream = this.f33786b;
            if (inputStream == null || Build.VERSION.SDK_INT < 33) {
                return 0L;
            }
            return inputStream.readAllBytes().length;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.smartdigimkt.z7.k
    public String b() throws Throwable {
        return a(false);
    }

    @Override // com.smartdigimkt.z7.k
    public String c() throws Throwable {
        return a(true);
    }

    private String a(boolean z2) throws Throwable {
        InputStreamReader inputStreamReader;
        if (this.f33786b == null) {
            try {
                HttpURLConnection httpURLConnection = this.f33785a;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    return "";
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        BufferedReader bufferedReader = null;
        try {
            inputStreamReader = new InputStreamReader(this.f33786b);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(inputStreamReader);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb.append(line);
                            if (z2) {
                                sb.append('\n');
                            }
                        } else {
                            try {
                                break;
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    bufferedReader2.close();
                    try {
                        inputStreamReader.close();
                    } catch (Throwable unused3) {
                    }
                    try {
                        InputStream inputStream = this.f33786b;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        HttpURLConnection httpURLConnection2 = this.f33785a;
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                    } catch (Throwable unused4) {
                    }
                    return sb.toString();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    try {
                        InputStream inputStream2 = this.f33786b;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        HttpURLConnection httpURLConnection3 = this.f33785a;
                        if (httpURLConnection3 != null) {
                            httpURLConnection3.disconnect();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable unused7) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
        }
    }
}
