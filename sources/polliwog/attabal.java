package polliwog;

import androidx.media3.common.ParserException;
import com.inmobi.media.core.config.models.AdConfig;
import cybernatic.monoploid;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements dern {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f35419beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public long f35420competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f35422marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public polliwog.saneness f35424wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final byte[] f35418attabal = new byte[8];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ArrayDeque<saneness> f35423saneness = new ArrayDeque<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final competently f35421dern = new competently();

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f35425attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final long f35426saneness;

        public saneness(int i, long j) {
            this.f35425attabal = i;
            this.f35426saneness = j;
        }
    }

    public static String beachfront(monoploid monoploidVar, int i) throws IOException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        monoploidVar.readFully(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    @Override // polliwog.dern
    public boolean attabal(monoploid monoploidVar) throws IOException {
        decarock.attabal.taiyuan(this.f35424wireman);
        while (true) {
            saneness sanenessVarPeek = this.f35423saneness.peek();
            if (sanenessVarPeek != null && monoploidVar.getPosition() >= sanenessVarPeek.f35426saneness) {
                this.f35424wireman.endMasterElement(this.f35423saneness.pop().f35425attabal);
                return true;
            }
            if (this.f35422marial == 0) {
                long jWireman = this.f35421dern.wireman(monoploidVar, true, false, 4);
                if (jWireman == -2) {
                    jWireman = dern(monoploidVar);
                }
                if (jWireman == -1) {
                    return false;
                }
                this.f35419beachfront = (int) jWireman;
                this.f35422marial = 1;
            }
            if (this.f35422marial == 1) {
                this.f35420competently = this.f35421dern.wireman(monoploidVar, false, true, 8);
                this.f35422marial = 2;
            }
            int elementType = this.f35424wireman.getElementType(this.f35419beachfront);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = monoploidVar.getPosition();
                    this.f35423saneness.push(new saneness(this.f35419beachfront, this.f35420competently + position));
                    this.f35424wireman.startMasterElement(this.f35419beachfront, position, this.f35420competently);
                    this.f35422marial = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j = this.f35420competently;
                    if (j <= 8) {
                        this.f35424wireman.integerElement(this.f35419beachfront, marial(monoploidVar, (int) j));
                        this.f35422marial = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("Invalid integer size: " + this.f35420competently, null);
                }
                if (elementType == 3) {
                    long j2 = this.f35420competently;
                    if (j2 <= 2147483647L) {
                        this.f35424wireman.stringElement(this.f35419beachfront, beachfront(monoploidVar, (int) j2));
                        this.f35422marial = 0;
                        return true;
                    }
                    throw ParserException.createForMalformedContainer("String element size: " + this.f35420competently, null);
                }
                if (elementType == 4) {
                    this.f35424wireman.attabal(this.f35419beachfront, (int) this.f35420competently, monoploidVar);
                    this.f35422marial = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw ParserException.createForMalformedContainer("Invalid element type " + elementType, null);
                }
                long j3 = this.f35420competently;
                if (j3 == 4 || j3 == 8) {
                    this.f35424wireman.floatElement(this.f35419beachfront, wireman(monoploidVar, (int) j3));
                    this.f35422marial = 0;
                    return true;
                }
                throw ParserException.createForMalformedContainer("Invalid float size: " + this.f35420competently, null);
            }
            monoploidVar.skipFully((int) this.f35420competently);
            this.f35422marial = 0;
        }
    }

    @RequiresNonNull({"processor"})
    public final long dern(monoploid monoploidVar) throws IOException {
        monoploidVar.resetPeekPosition();
        while (true) {
            monoploidVar.peekFully(this.f35418attabal, 0, 4);
            int iDern = competently.dern(this.f35418attabal[0]);
            if (iDern != -1 && iDern <= 4) {
                int iAttabal = (int) competently.attabal(this.f35418attabal, iDern, false);
                if (this.f35424wireman.isLevel1Element(iAttabal)) {
                    monoploidVar.skipFully(iDern);
                    return iAttabal;
                }
            }
            monoploidVar.skipFully(1);
        }
    }

    public final long marial(monoploid monoploidVar, int i) throws IOException {
        monoploidVar.readFully(this.f35418attabal, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f35418attabal[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
        }
        return j;
    }

    @Override // polliwog.dern
    public void reset() {
        this.f35422marial = 0;
        this.f35423saneness.clear();
        this.f35421dern.marial();
    }

    @Override // polliwog.dern
    public void saneness(polliwog.saneness sanenessVar) {
        this.f35424wireman = sanenessVar;
    }

    public final double wireman(monoploid monoploidVar, int i) throws IOException {
        long jMarial = marial(monoploidVar, i);
        return i == 4 ? Float.intBitsToFloat((int) jMarial) : Double.longBitsToDouble(jMarial);
    }
}
