package puffin;

import decarock.grimness;
import java.util.UUID;

/* JADX INFO: compiled from: FrameworkCryptoConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class polloi implements miliaria.saneness {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final boolean f36026wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final UUID f36027attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    @Deprecated
    public final boolean f36028dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final byte[] f36029saneness;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(grimness.f25084dern)) {
            String str = grimness.f25094wireman;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        f36026wireman = z;
    }

    public polloi(UUID uuid, byte[] bArr, boolean z) {
        this.f36027attabal = uuid;
        this.f36029saneness = bArr;
        this.f36028dern = z;
    }
}
