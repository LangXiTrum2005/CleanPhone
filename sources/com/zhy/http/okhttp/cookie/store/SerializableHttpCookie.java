package com.zhy.http.okhttp.cookie.store;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import okhttp3.Cookie;

/* JADX INFO: loaded from: classes6.dex */
public class SerializableHttpCookie implements Serializable {
    private static final long serialVersionUID = 6374381323722046732L;

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        String str = (String) objectInputStream.readObject();
        String str2 = (String) objectInputStream.readObject();
        long j = objectInputStream.readLong();
        String str3 = (String) objectInputStream.readObject();
        String str4 = (String) objectInputStream.readObject();
        boolean z2 = objectInputStream.readBoolean();
        boolean z3 = objectInputStream.readBoolean();
        boolean z4 = objectInputStream.readBoolean();
        objectInputStream.readBoolean();
        Cookie.Builder builderExpiresAt = new Cookie.Builder().name(str).value(str2).expiresAt(j);
        Cookie.Builder builderPath = (z4 ? builderExpiresAt.hostOnlyDomain(str3) : builderExpiresAt.domain(str3)).path(str4);
        if (z2) {
            builderPath = builderPath.secure();
        }
        if (z3) {
            builderPath = builderPath.httpOnly();
        }
        builderPath.build();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        throw null;
    }
}
