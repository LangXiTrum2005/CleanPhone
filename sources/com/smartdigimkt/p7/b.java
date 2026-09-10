package com.smartdigimkt.p7;

import com.smartdigimkt.n8.h;
import com.smartdigimkt.s6.c;
import com.smartdigimkt.sdk.api.IDlHandler;
import com.smartdigimkt.sdk.api.IExHandler;
import com.smartdigimkt.sdk.api.IOdHandler;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37731a = getClass().getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37732b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f37733c = new Object();
    private c d;

    private Object a(Class<?> cls, String str) {
        return h.a(this.f37731a, cls, str);
    }

    @Override // com.smartdigimkt.p7.a
    public c b() {
        IExHandler iExHandler;
        IDlHandler iDlHandler;
        IOdHandler iOdHandler;
        if (this.f37732b) {
            return this.d;
        }
        synchronized (this.f37733c) {
            if (this.f37732b) {
                return this.d;
            }
            try {
                iExHandler = (IExHandler) a(IExHandler.class, "");
            } catch (Throwable unused) {
                iExHandler = null;
            }
            try {
                iDlHandler = (IDlHandler) a(IDlHandler.class, "com.smartdigimkt.dlpd.DlHandler");
            } catch (Throwable unused2) {
                iDlHandler = null;
            }
            try {
                iOdHandler = (IOdHandler) a(IOdHandler.class, "com.smartdigimkt.odpd.OdHandler");
            } catch (Throwable unused3) {
                iOdHandler = null;
            }
            if (iExHandler != null || iDlHandler != null || iOdHandler != null) {
                Objects.toString(iExHandler);
                Objects.toString(iDlHandler);
                Objects.toString(iOdHandler);
                this.d = new c(iExHandler, iDlHandler, iOdHandler, null);
            }
            this.f37732b = true;
            return this.d;
        }
    }
}
