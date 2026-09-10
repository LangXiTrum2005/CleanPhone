package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.p;
import com.unity3d.services.core.di.ServiceProvider;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f37018d;

    public j(String str, String str2, p pVar) {
        this.f37016b = str;
        this.f37017c = str2;
        this.f37018d = pVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.n.f36643a.a(str);
            return (listA.isEmpty() && i.b().c(this.f37016b, this.f37017c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e10) {
            if (i.b().c(this.f37016b, this.f37017c, str)) {
                return a(str, new UnknownHostException(e10.getMessage()));
            }
            throw e10;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        p pVar = this.f37018d;
        if (pVar != null) {
            pVar.c(ServiceProvider.NAMED_LOCAL);
        }
        return i.b().a(str, unknownHostException);
    }
}
