package com.thinkup.core.common.n0.o.o;

import android.os.Build;
import com.thinkup.core.common.n0.o.mn;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends mn {
    private final InputStream m;
    private final HttpURLConnection o;

    public n(HttpURLConnection httpURLConnection, InputStream inputStream) {
        this.o = httpURLConnection;
        this.m = inputStream;
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final String m() {
        return o(false);
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final String n() {
        return o(true);
    }

    @Override // com.thinkup.core.common.n0.o.mn
    public final long o() {
        try {
            InputStream inputStream = this.m;
            if (inputStream == null || Build.VERSION.SDK_INT < 33) {
                return 0L;
            }
            return inputStream.readAllBytes().length;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private String o(boolean z2) throws Throwable {
        InputStreamReader inputStreamReader;
        if (this.m == null) {
            try {
                HttpURLConnection httpURLConnection = this.o;
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
            inputStreamReader = new InputStreamReader(this.m);
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
                        InputStream inputStream = this.m;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        HttpURLConnection httpURLConnection2 = this.o;
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
                        InputStream inputStream2 = this.m;
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        HttpURLConnection httpURLConnection3 = this.o;
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
