package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class l {
    public static List<e> a(q qVar, c.a aVar) throws IOException, g.a {
        return b(g.a(qVar, aVar, 1896449818).f33473a);
    }

    public static List<e> b(ByteBuffer byteBuffer) {
        try {
            ByteBuffer byteBufferA = g.a(byteBuffer);
            if (!byteBufferA.hasRemaining()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (byteBufferA.hasRemaining()) {
                try {
                    arrayList.add(a(g.a(byteBufferA)));
                } catch (a | BufferUnderflowException unused) {
                    return null;
                } catch (NoSuchAlgorithmException | CertificateException unused2) {
                }
            }
            return arrayList;
        } catch (a unused3) {
            return null;
        }
    }

    @DungeonFlag
    private static e a(ByteBuffer byteBuffer) throws NoSuchAlgorithmException, a, CertificateException {
        ByteBuffer byteBufferA = g.a(byteBuffer);
        byteBufferA.get(new byte[byteBufferA.remaining()]);
        byteBufferA.flip();
        byteBufferA.position(0);
        g.a(byteBufferA);
        byte[] bArrB = g.b(g.a(byteBufferA));
        try {
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(bArrB));
            if (certificateGenerateCertificate instanceof X509Certificate) {
                return new e(String.valueOf(((X509Certificate) certificateGenerateCertificate).getSubjectDN()), bArrB);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
