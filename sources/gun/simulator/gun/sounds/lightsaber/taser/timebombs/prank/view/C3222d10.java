package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.d10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3222d10 implements LI {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f4254a;
    public final S20 b = new S20(1);
    public volatile boolean c;
    public final /* synthetic */ C3398f10 d;

    public C3222d10(C3398f10 c3398f10, InputStream inputStream) {
        this.d = c3398f10;
        this.f4254a = new DataInputStream(inputStream);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void cancelLoad() {
        this.c = true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LI
    public final void load() throws IOException {
        String str;
        while (!this.c) {
            byte b = this.f4254a.readByte();
            if (b == 36) {
                int unsignedByte = this.f4254a.readUnsignedByte();
                int unsignedShort = this.f4254a.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort];
                this.f4254a.readFully(bArr, 0, unsignedShort);
                Cd0 cd0 = (Cd0) this.d.c.get(Integer.valueOf(unsignedByte));
                if (cd0 != null && !this.d.f) {
                    cd0.e.add(bArr);
                }
            } else if (this.d.f) {
                continue;
            } else {
                InterfaceC3133c10 interfaceC3133c10 = this.d.f4345a;
                S20 s20 = this.b;
                DataInputStream dataInputStream = this.f4254a;
                s20.getClass();
                AC acA = s20.a(S20.b(dataInputStream, b));
                while (acA == null) {
                    if (s20.f3696a == 3) {
                        long j = s20.b;
                        if (j <= 0) {
                            throw new IllegalStateException("Expects a greater than zero Content-Length.");
                        }
                        int iR = AbstractC2995aW.r(j);
                        FW.s(iR != -1);
                        byte[] bArr2 = new byte[iR];
                        dataInputStream.readFully(bArr2, 0, iR);
                        FW.s(s20.f3696a == 3);
                        if (iR > 0) {
                            int i = iR - 1;
                            if (bArr2[i] == 10) {
                                if (iR > 1) {
                                    int i2 = iR - 2;
                                    if (bArr2[i2] == 13) {
                                        str = new String(bArr2, 0, i2, C3398f10.g);
                                    } else {
                                        str = new String(bArr2, 0, i, C3398f10.g);
                                    }
                                } else {
                                    str = new String(bArr2, 0, i, C3398f10.g);
                                }
                                ((List) s20.c).add(str);
                                acA = AC.j((List) s20.c);
                                ((List) s20.c).clear();
                                s20.f3696a = 1;
                                s20.b = 0L;
                            }
                        }
                        throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                    }
                    acA = s20.a(S20.b(dataInputStream, dataInputStream.readByte()));
                }
                O00 o00 = (O00) interfaceC3133c10;
                o00.f3488a.post(new RunnableC3976le0(17, o00, acA));
            }
        }
    }
}
