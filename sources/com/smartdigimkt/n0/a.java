package com.smartdigimkt.n0;

import android.os.SystemClock;
import android.util.Log;
import com.smartdigimkt.h0.h;
import com.smartdigimkt.h0.j;
import com.smartdigimkt.h0.m;
import java.io.IOException;
import java.net.ConnectException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.SSLProtocolException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public class a implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f36907c = "a";
    private static final int d = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.m0.a f36908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.smartdigimkt.h0.c f36909b;

    public a(com.smartdigimkt.m0.a aVar, com.smartdigimkt.h0.c cVar) {
        this.f36908a = aVar;
        this.f36909b = cVar;
    }

    @Override // com.smartdigimkt.h0.h
    public c a(j<?> jVar) throws com.smartdigimkt.i0.a {
        byte[] bArrA;
        b bVar;
        String str;
        String str2;
        String str3;
        String str4;
        char c2;
        byte[] bArr;
        b bVarA;
        if (jVar == null) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m mVarK = jVar.k();
        String str5 = "MalformedURLException ex= ";
        char c3 = '\t';
        String str6 = "UnknownHostException ex= ";
        char c4 = 15;
        int i2 = 399;
        if (mVarK != null && mVarK.f() > 0) {
            while (!jVar.p()) {
                try {
                    try {
                        jVar.q();
                        try {
                            bVarA = this.f36908a.a(jVar);
                            try {
                                int iC = bVarA.c();
                                byte[] bArrA2 = jVar.a(bVarA, this.f36909b);
                                try {
                                    str3 = str5;
                                    str4 = str6;
                                    bArr = bArrA2;
                                    try {
                                        a(SystemClock.elapsedRealtime() - jElapsedRealtime, jVar, bArr, iC);
                                        if (iC < 200 || iC > i2) {
                                            throw new IOException();
                                        }
                                        return new c(iC, bArr, bVarA.b());
                                    } catch (ConnectException e2) {
                                        e = e2;
                                        str = str3;
                                        str2 = str4;
                                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        a("ConnectException ex= " + e.getMessage(), jElapsedRealtime2, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(12, null), jElapsedRealtime2);
                                        str5 = str;
                                        str6 = str2;
                                        c3 = '\t';
                                        c4 = 15;
                                        i2 = 399;
                                    } catch (MalformedURLException e3) {
                                        e = e3;
                                        str2 = str4;
                                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        str = str3;
                                        a(str + e.getMessage(), jElapsedRealtime3, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(4, null), jElapsedRealtime3);
                                        str5 = str;
                                        str6 = str2;
                                        c3 = '\t';
                                        c4 = 15;
                                        i2 = 399;
                                    } catch (SocketTimeoutException e4) {
                                        e = e4;
                                        str = str3;
                                        str2 = str4;
                                        long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        a("SocketTimeoutException ex= " + e.getMessage(), jElapsedRealtime4, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(10, null), jElapsedRealtime4);
                                        str5 = str;
                                        str6 = str2;
                                        c3 = '\t';
                                        c4 = 15;
                                        i2 = 399;
                                    } catch (UnknownHostException e5) {
                                        e = e5;
                                        c2 = 15;
                                        long jElapsedRealtime5 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        String str7 = str4;
                                        a(str7 + e.getMessage(), jElapsedRealtime5, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(9, null), jElapsedRealtime5);
                                        c3 = '\t';
                                        c4 = c2;
                                        str6 = str7;
                                        str5 = str3;
                                        i2 = 399;
                                    } catch (SSLProtocolException e6) {
                                        e = e6;
                                        str = str3;
                                        str2 = str4;
                                        long jElapsedRealtime6 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        a("SSLProtocolException ex= " + e.getMessage(), jElapsedRealtime6, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(11, null), jElapsedRealtime6);
                                        str5 = str;
                                        str6 = str2;
                                        c3 = '\t';
                                        c4 = 15;
                                        i2 = 399;
                                    } catch (ConnectTimeoutException e7) {
                                        e = e7;
                                        str = str3;
                                        str2 = str4;
                                        long jElapsedRealtime7 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        a("ConnectTimeoutException ex= " + e.getMessage(), jElapsedRealtime7, jVar);
                                        a(jVar, new com.smartdigimkt.i0.a(3, null), jElapsedRealtime7);
                                        str5 = str;
                                        str6 = str2;
                                        c3 = '\t';
                                        c4 = 15;
                                        i2 = 399;
                                    } catch (IOException e8) {
                                        e = e8;
                                        long jElapsedRealtime8 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                                        a("IOException ex= " + e.getMessage(), jElapsedRealtime8, jVar);
                                        if (bVarA == null) {
                                            a(jVar, new com.smartdigimkt.i0.a(14, null), jElapsedRealtime8);
                                            str5 = str3;
                                            str6 = str4;
                                            c3 = '\t';
                                            c4 = 15;
                                        } else {
                                            int iC2 = bVarA.c();
                                            if (bArr != null) {
                                                c cVar = new c(iC2, bArr, bVarA.b());
                                                if (iC2 >= 400 && iC2 <= 499) {
                                                    a(jVar, new com.smartdigimkt.i0.a(6, null), jElapsedRealtime8);
                                                } else {
                                                    if (iC2 >= 500 && iC2 <= 599) {
                                                        throw new com.smartdigimkt.i0.a(7, cVar);
                                                    }
                                                    a(jVar, new com.smartdigimkt.i0.a(2, null), jElapsedRealtime8);
                                                }
                                                str5 = str3;
                                                str6 = str4;
                                                c3 = '\t';
                                                c4 = 15;
                                            } else {
                                                a(jVar, new com.smartdigimkt.i0.a(15, null), jElapsedRealtime8);
                                                c4 = 15;
                                                str5 = str3;
                                                str6 = str4;
                                                c3 = '\t';
                                            }
                                            i2 = 399;
                                        }
                                    }
                                } catch (IOException e9) {
                                    e = e9;
                                    str3 = str5;
                                    str4 = str6;
                                    bArr = bArrA2;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                str3 = str5;
                                str4 = str6;
                                bArr = null;
                            }
                        } catch (ConnectException e11) {
                            e = e11;
                            str3 = str5;
                            str4 = str6;
                        } catch (MalformedURLException e12) {
                            e = e12;
                            str3 = str5;
                            str4 = str6;
                        } catch (SocketTimeoutException e13) {
                            e = e13;
                            str3 = str5;
                            str4 = str6;
                        } catch (UnknownHostException e14) {
                            e = e14;
                            str3 = str5;
                            str4 = str6;
                        } catch (SSLProtocolException e15) {
                            e = e15;
                            str3 = str5;
                            str4 = str6;
                        } catch (ConnectTimeoutException e16) {
                            e = e16;
                            str3 = str5;
                            str4 = str6;
                        }
                    } catch (ConnectException e17) {
                        e = e17;
                        str = str5;
                        str2 = str6;
                    } catch (MalformedURLException e18) {
                        e = e18;
                        str3 = str5;
                        str2 = str6;
                    } catch (SocketTimeoutException e19) {
                        e = e19;
                        str = str5;
                        str2 = str6;
                    } catch (UnknownHostException e20) {
                        e = e20;
                        str3 = str5;
                        str4 = str6;
                        c2 = c4;
                    } catch (SSLProtocolException e21) {
                        e = e21;
                        str = str5;
                        str2 = str6;
                    } catch (ConnectTimeoutException e22) {
                        e = e22;
                        str = str5;
                        str2 = str6;
                    }
                } catch (IOException e23) {
                    e = e23;
                    str3 = str5;
                    str4 = str6;
                    bArr = null;
                    bVarA = null;
                }
            }
            jVar.a("perform-discard-cancelled");
            this.f36909b.b(jVar);
            throw new com.smartdigimkt.i0.a(-2, null);
        }
        if (jVar.p()) {
            jVar.a("perform-discard-cancelled");
            this.f36909b.b(jVar);
            throw new com.smartdigimkt.i0.a(-2, null);
        }
        try {
            try {
                jVar.q();
                b bVarA2 = this.f36908a.a(jVar);
                try {
                    int iC3 = bVarA2.c();
                    bArrA = jVar.a(bVarA2, this.f36909b);
                    try {
                        bVar = bVarA2;
                        try {
                            a(SystemClock.elapsedRealtime() - jElapsedRealtime, jVar, bArrA, iC3);
                            if (iC3 < 200 || iC3 > 399) {
                                throw new IOException();
                            }
                            return new c(iC3, bArrA, bVar.b());
                        } catch (IOException e24) {
                            e = e24;
                            a("IOException ex= " + e.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                            if (bVar == null) {
                                throw new com.smartdigimkt.i0.a(14, null);
                            }
                            int iC4 = bVar.c();
                            if (bArrA == null) {
                                throw new com.smartdigimkt.i0.a(15, null);
                            }
                            c cVar2 = new c(iC4, bArrA, bVar.b());
                            if (iC4 >= 400 && iC4 <= 499) {
                                throw new com.smartdigimkt.i0.a(6, cVar2);
                            }
                            if (iC4 < 500 || iC4 > 599) {
                                throw new com.smartdigimkt.i0.a(2, cVar2);
                            }
                            throw new com.smartdigimkt.i0.a(7, cVar2);
                        }
                    } catch (IOException e25) {
                        e = e25;
                        bVar = bVarA2;
                    }
                } catch (IOException e26) {
                    e = e26;
                    bVar = bVarA2;
                    bArrA = null;
                }
            } catch (ConnectException e27) {
                a("ConnectException ex= " + e27.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(12, null);
            } catch (MalformedURLException e28) {
                a("MalformedURLException ex= " + e28.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(4, null);
            } catch (SocketTimeoutException e29) {
                a("SocketTimeoutException ex= " + e29.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(10, null);
            } catch (UnknownHostException e30) {
                a("UnknownHostException ex= " + e30.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(9, null);
            } catch (SSLProtocolException e31) {
                a("SSLProtocolException ex= " + e31.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(11, null);
            } catch (ConnectTimeoutException e32) {
                a("ConnectTimeoutException ex= " + e32.getMessage(), SystemClock.elapsedRealtime() - jElapsedRealtime, jVar);
                throw new com.smartdigimkt.i0.a(3, null);
            }
        } catch (IOException e33) {
            e = e33;
            bArrA = null;
            bVar = null;
        }
    }

    private void a(long j, j<?> jVar, byte[] bArr, int i2) {
        if (com.smartdigimkt.b.b.f33800a) {
            Object objValueOf = AbstractJsonLexerKt.NULL;
            try {
                if (j > com.smartdigimkt.u2.m.D0) {
                    String strO = jVar.o();
                    Integer numValueOf = Integer.valueOf(jVar.i());
                    Long lValueOf = Long.valueOf(j);
                    if (bArr != null) {
                        objValueOf = Integer.valueOf(bArr.length);
                    }
                    String.format("Slow HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", strO, numValueOf, lValueOf, objValueOf, Integer.valueOf(i2), Integer.valueOf(jVar.k().h()));
                    return;
                }
                String strO2 = jVar.o();
                Integer numValueOf2 = Integer.valueOf(jVar.i());
                Long lValueOf2 = Long.valueOf(j);
                if (bArr != null) {
                    objValueOf = Integer.valueOf(bArr.length);
                }
                String.format("Normal HTTP response for request=<%s> [method=%s] [lifetime=%d], [size=%s], [statusCode=%d], [retryCount=%s]", strO2, numValueOf2, lValueOf2, objValueOf, Integer.valueOf(i2), Integer.valueOf(jVar.k().h()));
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str, long j, j<?> jVar) {
        if (com.smartdigimkt.b.b.f33800a) {
            try {
                URL url = new URL(jVar.o());
                String str2 = f36907c;
                String str3 = url.getHost() + url.getPath();
                Long lValueOf = Long.valueOf(j);
                if (str == null) {
                    str = AbstractJsonLexerKt.NULL;
                }
                Log.i(str2, String.format("HTTP exception for request=<%s> [lifetime=%d], [exception=%s], [retryCount=%s-%s]", str3, lValueOf, str, Integer.valueOf(jVar.k().h()), Integer.valueOf(jVar.k().f())));
            } catch (Exception unused) {
            }
        }
    }

    private void a(j<?> jVar, com.smartdigimkt.i0.a aVar, long j) throws com.smartdigimkt.i0.a {
        if (jVar != null && aVar != null) {
            try {
                m mVarK = jVar.k();
                if (mVarK != null) {
                    long jB = mVarK.b();
                    if (mVarK.a(aVar) && j < jB) {
                        this.f36909b.e(jVar);
                        return;
                    }
                    throw aVar;
                }
                throw aVar;
            } catch (Exception unused) {
                throw aVar;
            }
        }
        throw new com.smartdigimkt.i0.a(4, null);
    }
}
