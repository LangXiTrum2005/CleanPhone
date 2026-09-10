package polliwog;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.inmobi.media.core.config.models.AdConfig;
import cybernatic.monoploid;
import decarock.stratoscope;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f35427attabal = new stratoscope(8);

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f35428saneness;

    public final long attabal(monoploid monoploidVar) throws IOException {
        int i = 0;
        monoploidVar.peekFully(this.f35427attabal.marial(), 0, 1);
        int i2 = this.f35427attabal.marial()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        monoploidVar.peekFully(this.f35427attabal.marial(), 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f35427attabal.marial()[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + (i5 << 8);
        }
        this.f35428saneness += i4 + 1;
        return i5;
    }

    public boolean saneness(monoploid monoploidVar) throws IOException {
        long length = monoploidVar.getLength();
        long j = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j = length;
        }
        int i = (int) j;
        monoploidVar.peekFully(this.f35427attabal.marial(), 0, 4);
        long jMerc = this.f35427attabal.merc();
        this.f35428saneness = 4;
        while (jMerc != 440786851) {
            int i2 = this.f35428saneness + 1;
            this.f35428saneness = i2;
            if (i2 == i) {
                return false;
            }
            monoploidVar.peekFully(this.f35427attabal.marial(), 0, 1);
            jMerc = ((jMerc << 8) & (-256)) | ((long) (this.f35427attabal.marial()[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        long jAttabal = attabal(monoploidVar);
        long j2 = this.f35428saneness;
        if (jAttabal != Long.MIN_VALUE && (length == -1 || j2 + jAttabal < length)) {
            while (true) {
                int i3 = this.f35428saneness;
                long j3 = j2 + jAttabal;
                if (i3 < j3) {
                    if (attabal(monoploidVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jAttabal2 = attabal(monoploidVar);
                    if (jAttabal2 < 0 || jAttabal2 > 2147483647L) {
                        return false;
                    }
                    if (jAttabal2 != 0) {
                        int i4 = (int) jAttabal2;
                        monoploidVar.advancePeekPosition(i4);
                        this.f35428saneness += i4;
                    }
                } else if (i3 == j3) {
                    return true;
                }
            }
        }
        return false;
    }
}
