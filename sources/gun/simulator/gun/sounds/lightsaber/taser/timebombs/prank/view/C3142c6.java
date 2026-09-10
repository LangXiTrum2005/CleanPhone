package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3142c6 {
    private static int CONNECTION_ERROR;
    static final /* synthetic */ C3142c6 $$INSTANCE = new C3142c6();
    private static int REQUEST_ERROR = 1;
    private static int DISK_ERROR = 2;
    private static int FILE_NOT_FOUND_ERROR = 3;
    private static int INTERNAL_ERROR = 4;

    private C3142c6() {
    }

    public final int getCONNECTION_ERROR() {
        return CONNECTION_ERROR;
    }

    public final int getDISK_ERROR() {
        return DISK_ERROR;
    }

    public final int getFILE_NOT_FOUND_ERROR() {
        return FILE_NOT_FOUND_ERROR;
    }

    public final int getINTERNAL_ERROR() {
        return INTERNAL_ERROR;
    }

    public final int getREQUEST_ERROR() {
        return REQUEST_ERROR;
    }

    public final void setCONNECTION_ERROR(int i) {
        CONNECTION_ERROR = i;
    }

    public final void setDISK_ERROR(int i) {
        DISK_ERROR = i;
    }

    public final void setFILE_NOT_FOUND_ERROR(int i) {
        FILE_NOT_FOUND_ERROR = i;
    }

    public final void setINTERNAL_ERROR(int i) {
        INTERNAL_ERROR = i;
    }

    public final void setREQUEST_ERROR(int i) {
        REQUEST_ERROR = i;
    }
}
