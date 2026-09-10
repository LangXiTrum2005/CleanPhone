package murrine;

import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ByteArrayOutputStream f33665attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final DataOutputStream f33666saneness;

    public saneness() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f33665attabal = byteArrayOutputStream;
        this.f33666saneness = new DataOutputStream(byteArrayOutputStream);
    }

    public static void saneness(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] attabal(EventMessage eventMessage) {
        this.f33665attabal.reset();
        try {
            saneness(this.f33666saneness, eventMessage.f13029kowloon);
            String str = eventMessage.value;
            if (str == null) {
                str = "";
            }
            saneness(this.f33666saneness, str);
            this.f33666saneness.writeLong(eventMessage.f13028arytenoidectomy);
            this.f33666saneness.writeLong(eventMessage.f13031monoploid);
            this.f33666saneness.write(eventMessage.f13032polloi);
            this.f33666saneness.flush();
            return this.f33665attabal.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
