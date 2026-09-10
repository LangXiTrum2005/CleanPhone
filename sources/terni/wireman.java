package terni;

import android.util.Log;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: GifHeaderParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class wireman {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public dern f38817dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public ByteBuffer f38818saneness;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f38816attabal = new byte[256];

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f38819wireman = 0;

    public final void apical() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) wireman());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f38817dern.f38781saneness = 1;
            return;
        }
        formularize();
        if (!this.f38817dern.f38779impromptu || saneness()) {
            return;
        }
        dern dernVar = this.f38817dern;
        dernVar.f38772attabal = competently(dernVar.f38782taiyuan);
        dern dernVar2 = this.f38817dern;
        dernVar2.f38777formularize = dernVar2.f38772attabal[dernVar2.f38775cutely];
    }

    public wireman arytenoidectomy(ByteBuffer byteBuffer) {
        kowloon();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f38818saneness = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f38818saneness.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    public void attabal() {
        this.f38818saneness = null;
        this.f38817dern = null;
    }

    public final void beachfront() {
        int iWireman = wireman();
        this.f38819wireman = iWireman;
        if (iWireman <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.f38819wireman;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.f38818saneness.get(this.f38816attabal, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.f38817dern.f38781saneness = 1;
                return;
            }
        }
    }

    public final int[] competently(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.f38818saneness.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.f38817dern.f38781saneness = 1;
            return iArr;
        }
    }

    public final void cutely() {
        wireman();
        int iWireman = wireman();
        saneness sanenessVar = this.f38817dern.f38783wireman;
        int i = (iWireman & 28) >> 2;
        sanenessVar.f38808competently = i;
        if (i == 0) {
            sanenessVar.f38808competently = 1;
        }
        sanenessVar.f38807beachfront = (iWireman & 1) != 0;
        int iTriweekly = triweekly();
        if (iTriweekly < 2) {
            iTriweekly = 10;
        }
        saneness sanenessVar2 = this.f38817dern.f38783wireman;
        sanenessVar2.f38814taiyuan = iTriweekly * 10;
        sanenessVar2.f38811impromptu = wireman();
        wireman();
    }

    public dern dern() {
        if (this.f38818saneness == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (saneness()) {
            return this.f38817dern;
        }
        apical();
        if (!saneness()) {
            impromptu();
            dern dernVar = this.f38817dern;
            if (dernVar.f38776dern < 0) {
                dernVar.f38781saneness = 1;
            }
        }
        return this.f38817dern;
    }

    public final void formularize() {
        this.f38817dern.f38773beachfront = triweekly();
        this.f38817dern.f38774competently = triweekly();
        int iWireman = wireman();
        dern dernVar = this.f38817dern;
        dernVar.f38779impromptu = (iWireman & 128) != 0;
        dernVar.f38782taiyuan = (int) Math.pow(2.0d, (iWireman & 7) + 1);
        this.f38817dern.f38775cutely = wireman();
        this.f38817dern.f38771apical = wireman();
    }

    public final void impassible() {
        do {
            beachfront();
            byte[] bArr = this.f38816attabal;
            if (bArr[0] == 1) {
                this.f38817dern.f38778impassible = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            }
            if (this.f38819wireman <= 0) {
                return;
            }
        } while (!saneness());
    }

    public final void impromptu() {
        taiyuan(Integer.MAX_VALUE);
    }

    public final void kowloon() {
        this.f38818saneness = null;
        Arrays.fill(this.f38816attabal, (byte) 0);
        this.f38817dern = new dern();
        this.f38819wireman = 0;
    }

    public final void marial() {
        this.f38817dern.f38783wireman.f38806attabal = triweekly();
        this.f38817dern.f38783wireman.f38813saneness = triweekly();
        this.f38817dern.f38783wireman.f38810dern = triweekly();
        this.f38817dern.f38783wireman.f38815wireman = triweekly();
        int iWireman = wireman();
        boolean z = (iWireman & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iWireman & 7) + 1);
        saneness sanenessVar = this.f38817dern.f38783wireman;
        sanenessVar.f38812marial = (iWireman & 64) != 0;
        if (z) {
            sanenessVar.f38805apical = competently(iPow);
        } else {
            sanenessVar.f38805apical = null;
        }
        this.f38817dern.f38783wireman.f38809cutely = this.f38818saneness.position();
        polloi();
        if (saneness()) {
            return;
        }
        dern dernVar = this.f38817dern;
        dernVar.f38776dern++;
        dernVar.f38780marial.add(dernVar.f38783wireman);
    }

    public final void monoploid() {
        int iWireman;
        do {
            iWireman = wireman();
            this.f38818saneness.position(Math.min(this.f38818saneness.position() + iWireman, this.f38818saneness.limit()));
        } while (iWireman > 0);
    }

    public final void polloi() {
        wireman();
        monoploid();
    }

    public final boolean saneness() {
        return this.f38817dern.f38781saneness != 0;
    }

    public final void taiyuan(int i) {
        boolean z = false;
        while (!z && !saneness() && this.f38817dern.f38776dern <= i) {
            int iWireman = wireman();
            if (iWireman == 33) {
                int iWireman2 = wireman();
                if (iWireman2 == 1) {
                    monoploid();
                } else if (iWireman2 == 249) {
                    this.f38817dern.f38783wireman = new saneness();
                    cutely();
                } else if (iWireman2 == 254) {
                    monoploid();
                } else if (iWireman2 != 255) {
                    monoploid();
                } else {
                    beachfront();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.f38816attabal[i2]);
                    }
                    if (sb.toString().equals("NETSCAPE2.0")) {
                        impassible();
                    } else {
                        monoploid();
                    }
                }
            } else if (iWireman == 44) {
                dern dernVar = this.f38817dern;
                if (dernVar.f38783wireman == null) {
                    dernVar.f38783wireman = new saneness();
                }
                marial();
            } else if (iWireman != 59) {
                this.f38817dern.f38781saneness = 1;
            } else {
                z = true;
            }
        }
    }

    public final int triweekly() {
        return this.f38818saneness.getShort();
    }

    public final int wireman() {
        try {
            return this.f38818saneness.get() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        } catch (Exception unused) {
            this.f38817dern.f38781saneness = 1;
            return 0;
        }
    }
}
