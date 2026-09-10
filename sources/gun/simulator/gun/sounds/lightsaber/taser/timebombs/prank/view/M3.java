package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class M3 implements InterfaceC4429ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4429ql f3388a;
    public final byte[] b;
    public final byte[] c;
    public CipherInputStream d;

    public M3(InterfaceC4429ql interfaceC4429ql, byte[] bArr, byte[] bArr2) {
        this.f3388a = interfaceC4429ql;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void c(Bd0 bd0) {
        bd0.getClass();
        this.f3388a.c(bd0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        if (this.d != null) {
            this.d = null;
            this.f3388a.close();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(this.c));
                C4692tl c4692tl = new C4692tl(this.f3388a, c4868vl);
                this.d = new CipherInputStream(c4692tl, cipher);
                c4692tl.h();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        return this.f3388a.getResponseHeaders();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        return this.f3388a.getUri();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.d.getClass();
        int i3 = this.d.read(bArr, i, i2);
        if (i3 < 0) {
            return -1;
        }
        return i3;
    }
}
