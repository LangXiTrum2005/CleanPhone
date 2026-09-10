package com.thinkup.core.common.res.image;

import android.os.SystemClock;
import com.thinkup.core.common.ooo.m.o0;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    protected long m0;
    protected long mm;
    protected long mo;
    private final String o = getClass().getSimpleName();
    protected String o0;
    protected long om;
    protected long on;
    protected boolean oo;

    /* JADX INFO: renamed from: com.thinkup.core.common.res.image.m$1, reason: invalid class name */
    public class AnonymousClass1 extends o0 {
        public AnonymousClass1() {
        }

        private void m(String str) throws Throwable {
            m.this.om = System.currentTimeMillis();
            m.this.on = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    String unused = m.this.o;
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setInstanceFollowRedirects(false);
                        Map<String, String> mapO = m.this.o();
                        if (mapO != null && mapO.size() > 0) {
                            for (String str2 : mapO.keySet()) {
                                httpURLConnection2.addRequestProperty(str2, mapO.get(str2));
                                String unused2 = m.this.o;
                                mapO.get(str2);
                            }
                        }
                        m mVar = m.this;
                        if (mVar.oo) {
                            mVar.o("-10001", "Task had been canceled.");
                            httpURLConnection2.disconnect();
                            return;
                        }
                        httpURLConnection2.setConnectTimeout(60000);
                        httpURLConnection2.setReadTimeout(60000);
                        httpURLConnection2.connect();
                        int responseCode = httpURLConnection2.getResponseCode();
                        if (responseCode == 200) {
                            m mVar2 = m.this;
                            if (mVar2.oo) {
                                mVar2.o("-10001", "Task had been canceled.");
                                httpURLConnection2.disconnect();
                                return;
                            }
                            mVar2.mm = httpURLConnection2.getContentLength();
                            InputStream inputStream = httpURLConnection2.getInputStream();
                            boolean zO = m.this.o(inputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            m.this.m0 = System.currentTimeMillis();
                            m.this.mo = SystemClock.elapsedRealtime();
                            if (zO) {
                                String unused3 = m.this.o;
                                m mVar3 = m.this;
                                String str3 = mVar3.o0;
                                mVar3.n();
                            } else {
                                String unused4 = m.this.o;
                                m mVar4 = m.this;
                                String str4 = mVar4.o0;
                                mVar4.o("-10000", "Save fail!");
                            }
                            httpURLConnection2.disconnect();
                            return;
                        }
                        String unused5 = m.this.o;
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            m.this.o("-10000", "Resource download fail, status code: " + responseCode + ", " + httpURLConnection2.getResponseMessage() + ", url: " + str);
                            httpURLConnection2.disconnect();
                            return;
                        }
                        m mVar5 = m.this;
                        if (mVar5.oo) {
                            mVar5.o("-10001", "Task had been canceled.");
                        } else {
                            String headerField = httpURLConnection2.getHeaderField("Location");
                            if (headerField != null) {
                                if (!headerField.toLowerCase().startsWith("http")) {
                                    m.this.o("-10000", "Final url is wrong:".concat(headerField));
                                    httpURLConnection2.disconnect();
                                    return;
                                }
                                m(headerField);
                            }
                        }
                        httpURLConnection2.disconnect();
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused6 = m.this.o;
                        e.getMessage();
                        m.this.o("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (StackOverflowError e3) {
                        e = e3;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused7 = m.this.o;
                        e.getMessage();
                        m.this.o("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Error e4) {
                        e = e4;
                        httpURLConnection = httpURLConnection2;
                        System.gc();
                        String unused8 = m.this.o;
                        e.getMessage();
                        m.this.o("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        httpURLConnection = httpURLConnection2;
                        m.this.o("-10000", e.getMessage());
                        String unused9 = m.this.o;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (ConnectTimeoutException e6) {
                        e = e6;
                        httpURLConnection = httpURLConnection2;
                        m.this.o("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Exception e7) {
                        e = e7;
                        httpURLConnection = httpURLConnection2;
                        String unused10 = m.this.o;
                        e.getMessage();
                        m.this.o("-10000", e.getMessage());
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th) {
                        th = th;
                        httpURLConnection = httpURLConnection2;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                } catch (SocketTimeoutException e8) {
                    e = e8;
                } catch (Exception e9) {
                    e = e9;
                } catch (OutOfMemoryError e10) {
                    e = e10;
                } catch (StackOverflowError e11) {
                    e = e11;
                } catch (Error e12) {
                    e = e12;
                } catch (ConnectTimeoutException e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.thinkup.core.common.ooo.m.o0
        public final void o() throws Throwable {
            try {
                m(m.this.o0);
            } catch (Exception e2) {
                String unused = m.this.o;
                e2.getMessage();
                m.this.o("-10000", e2.getMessage());
            } catch (OutOfMemoryError e3) {
                e = e3;
                System.gc();
                m.this.o("-10000", e.getMessage());
            } catch (StackOverflowError e4) {
                e = e4;
                System.gc();
                m.this.o("-10000", e.getMessage());
            }
        }
    }

    public m(String str) {
        this.o0 = str;
    }

    private static int m0() {
        return 60000;
    }

    private void om() {
        o(new AnonymousClass1());
    }

    private static int on() {
        return 60000;
    }

    private void oo() {
        this.oo = true;
    }

    public abstract void m();

    public abstract void n();

    public abstract Map<String, String> o();

    public abstract void o(o0 o0Var);

    public abstract void o(String str, String str2);

    public abstract boolean o(InputStream inputStream);

    public final void o0() {
        this.oo = false;
        o(new AnonymousClass1());
    }
}
