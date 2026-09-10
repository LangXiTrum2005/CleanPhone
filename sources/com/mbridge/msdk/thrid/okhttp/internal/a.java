package com.mbridge.msdk.thrid.okhttp.internal;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.c0;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.internal.connection.g;
import com.mbridge.msdk.thrid.okhttp.j;
import com.mbridge.msdk.thrid.okhttp.r;
import java.io.IOException;
import java.net.Socket;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f36256a;

    public abstract int a(a0.a aVar);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.c a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar, c0 c0Var);

    public abstract com.mbridge.msdk.thrid.okhttp.internal.connection.d a(i iVar);

    public abstract IOException a(com.mbridge.msdk.thrid.okhttp.d dVar, IOException iOException);

    public abstract Socket a(i iVar, com.mbridge.msdk.thrid.okhttp.a aVar, g gVar);

    public abstract void a(j jVar, SSLSocket sSLSocket, boolean z10);

    public abstract void a(r.a aVar, String str);

    public abstract void a(r.a aVar, String str, String str2);

    public abstract boolean a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.a aVar2);

    public abstract boolean a(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);

    public abstract void b(i iVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar);
}
