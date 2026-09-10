package infiltration;

import androidx.media3.common.Metadata;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import decarock.cuirassed;
import decarock.kattegat;
import decarock.stratoscope;
import java.nio.ByteBuffer;
import nomenclative.dern;
import nomenclative.saneness;

/* JADX INFO: compiled from: SpliceInfoDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal extends dern {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public kattegat f28847dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f28846attabal = new stratoscope();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final cuirassed f28848saneness = new cuirassed();

    @Override // nomenclative.dern
    public Metadata saneness(saneness sanenessVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        kattegat kattegatVar = this.f28847dern;
        if (kattegatVar == null || sanenessVar.f33943rotuma != kattegatVar.beachfront()) {
            kattegat kattegatVar2 = new kattegat(sanenessVar.f11480graveside);
            this.f28847dern = kattegatVar2;
            kattegatVar2.attabal(sanenessVar.f11480graveside - sanenessVar.f33943rotuma);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f28846attabal.walach(bArrArray, iLimit);
        this.f28848saneness.kowloon(bArrArray, iLimit);
        this.f28848saneness.polloi(39);
        long jImpromptu = (((long) this.f28848saneness.impromptu(1)) << 32) | ((long) this.f28848saneness.impromptu(32));
        this.f28848saneness.polloi(20);
        int iImpromptu = this.f28848saneness.impromptu(12);
        int iImpromptu2 = this.f28848saneness.impromptu(8);
        this.f28846attabal.splinterproof(14);
        if (iImpromptu2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iImpromptu2 == 255) {
            spliceNullCommand = PrivateCommand.attabal(this.f28846attabal, iImpromptu, jImpromptu);
        } else if (iImpromptu2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.attabal(this.f28846attabal);
        } else if (iImpromptu2 != 5) {
            spliceNullCommand = iImpromptu2 != 6 ? null : TimeSignalCommand.attabal(this.f28846attabal, jImpromptu, this.f28847dern);
        } else {
            spliceNullCommand = SpliceInsertCommand.attabal(this.f28846attabal, jImpromptu, this.f28847dern);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
