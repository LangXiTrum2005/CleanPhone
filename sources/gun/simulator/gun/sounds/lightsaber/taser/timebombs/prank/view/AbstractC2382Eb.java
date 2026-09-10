package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2382Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4151ne f3028a = new C4151ne(-1, null, null, 0);
    public static final int b = WD.V("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = WD.V("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);
    public static final SE d = new SE("BUFFERED", 1);
    public static final SE e = new SE("SHOULD_BUFFER", 1);
    public static final SE f = new SE("S_RESUMING_BY_RCV", 1);
    public static final SE g = new SE("RESUMING_BY_EB", 1);
    public static final SE h = new SE("POISONED", 1);
    public static final SE i = new SE("DONE_RCV", 1);
    public static final SE j = new SE("INTERRUPTED_SEND", 1);
    public static final SE k = new SE("INTERRUPTED_RCV", 1);
    public static final SE l = new SE("CHANNEL_CLOSED", 1);
    public static final SE m = new SE("SUSPEND", 1);
    public static final SE n = new SE("SUSPEND_NO_WAITER", 1);
    public static final SE o = new SE("FAILED", 1);
    public static final SE p = new SE("NO_RECEIVE_RESULT", 1);
    public static final SE q = new SE("CLOSE_HANDLER_CLOSED", 1);
    public static final SE r = new SE("CLOSE_HANDLER_INVOKED", 1);
    public static final SE s = new SE("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC2772Tc interfaceC2772Tc, Object obj, InterfaceC2766Sw interfaceC2766Sw) {
        SE seJ = interfaceC2772Tc.j(obj, interfaceC2766Sw);
        if (seJ == null) {
            return false;
        }
        interfaceC2772Tc.v(seJ);
        return true;
    }
}
