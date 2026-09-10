package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class HJ implements InterfaceC3513gK {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3513gK
    public final void onResult(Object obj) {
        Throwable th = (Throwable) obj;
        HJ hj = LottieAnimationView.n;
        Xg0 xg0 = AbstractC3014ah0.f4135a;
        if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
        AbstractC5005xJ.c("Unable to load composition.", th);
    }
}
