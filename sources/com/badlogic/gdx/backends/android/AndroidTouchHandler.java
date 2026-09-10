package com.badlogic.gdx.backends.android;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.MotionEventCompat;
import com.badlogic.gdx.Gdx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class AndroidTouchHandler {
    private void logAction(int i, int i2) {
        String strG;
        if (i == 0) {
            strG = "DOWN";
        } else if (i == 5) {
            strG = "POINTER DOWN";
        } else if (i == 1) {
            strG = "UP";
        } else if (i == 6) {
            strG = "POINTER UP";
        } else if (i == 4) {
            strG = "OUTSIDE";
        } else if (i == 3) {
            strG = "CANCEL";
        } else {
            strG = i == 2 ? "MOVE" : AbstractC5044xl.g("UNKNOWN (", i, ")");
        }
        Gdx.app.log("AndroidMultiTouchHandler", "action " + strG + ", Android pointer id: " + i2);
    }

    private void postTouchEvent(DefaultAndroidInput defaultAndroidInput, int i, int i2, int i3, int i4, int i5, long j) {
        DefaultAndroidInput.TouchEvent touchEventObtain = defaultAndroidInput.usedTouchEvents.obtain();
        touchEventObtain.timeStamp = j;
        touchEventObtain.pointer = i4;
        touchEventObtain.x = i2;
        touchEventObtain.y = i3;
        touchEventObtain.type = i;
        touchEventObtain.button = i5;
        defaultAndroidInput.touchEvents.add(touchEventObtain);
    }

    private int toGdxButton(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        return i == 16 ? 4 : -1;
    }

    public void onTouch(MotionEvent motionEvent, DefaultAndroidInput defaultAndroidInput) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        if (defaultAndroidInput == null || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction() & 255;
            int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
            int pointerId = motionEvent.getPointerId(action2);
            long jNanoTime = System.nanoTime();
            synchronized (defaultAndroidInput) {
                int i5 = 20;
                try {
                    switch (action) {
                        case 0:
                        case 5:
                            int freePointerIndex = defaultAndroidInput.getFreePointerIndex();
                            if (freePointerIndex < 20) {
                                defaultAndroidInput.realId[freePointerIndex] = pointerId;
                                int x = (int) motionEvent.getX(action2);
                                int y = (int) motionEvent.getY(action2);
                                int gdxButton = toGdxButton(motionEvent.getButtonState());
                                if (gdxButton != -1) {
                                    i = gdxButton;
                                    postTouchEvent(defaultAndroidInput, 0, x, y, freePointerIndex, i, jNanoTime);
                                } else {
                                    i = gdxButton;
                                }
                                defaultAndroidInput.touchX[freePointerIndex] = x;
                                defaultAndroidInput.touchY[freePointerIndex] = y;
                                defaultAndroidInput.deltaX[freePointerIndex] = 0;
                                defaultAndroidInput.deltaY[freePointerIndex] = 0;
                                int i6 = i;
                                defaultAndroidInput.touched[freePointerIndex] = i6 != -1;
                                defaultAndroidInput.button[freePointerIndex] = i6;
                                defaultAndroidInput.pressure[freePointerIndex] = motionEvent.getPressure(action2);
                            }
                            break;
                        case 1:
                        case 3:
                        case 4:
                        case 6:
                            int iLookUpPointerIndex = defaultAndroidInput.lookUpPointerIndex(pointerId);
                            if (iLookUpPointerIndex != -1 && iLookUpPointerIndex < 20) {
                                defaultAndroidInput.realId[iLookUpPointerIndex] = -1;
                                int x2 = (int) motionEvent.getX(action2);
                                int y2 = (int) motionEvent.getY(action2);
                                int i7 = defaultAndroidInput.button[iLookUpPointerIndex];
                                if (i7 == -1) {
                                    i2 = x2;
                                    z = false;
                                } else if (action == 3) {
                                    i2 = x2;
                                    z = false;
                                    postTouchEvent(defaultAndroidInput, 5, x2, y2, iLookUpPointerIndex, i7, jNanoTime);
                                } else {
                                    i2 = x2;
                                    z = false;
                                    postTouchEvent(defaultAndroidInput, 1, i2, y2, iLookUpPointerIndex, i7, jNanoTime);
                                }
                                defaultAndroidInput.touchX[iLookUpPointerIndex] = i2;
                                defaultAndroidInput.touchY[iLookUpPointerIndex] = y2;
                                defaultAndroidInput.deltaX[iLookUpPointerIndex] = z ? 1 : 0;
                                defaultAndroidInput.deltaY[iLookUpPointerIndex] = z ? 1 : 0;
                                defaultAndroidInput.touched[iLookUpPointerIndex] = z;
                                defaultAndroidInput.button[iLookUpPointerIndex] = z ? 1 : 0;
                                defaultAndroidInput.pressure[iLookUpPointerIndex] = 0.0f;
                                if (action == 3) {
                                    Arrays.fill(defaultAndroidInput.realId, -1);
                                    Arrays.fill(defaultAndroidInput.touched, z);
                                }
                            }
                            break;
                        case 2:
                            int pointerCount = motionEvent.getPointerCount();
                            int i8 = 0;
                            while (i8 < pointerCount) {
                                int pointerId2 = motionEvent.getPointerId(i8);
                                int x3 = (int) motionEvent.getX(i8);
                                int y3 = (int) motionEvent.getY(i8);
                                int iLookUpPointerIndex2 = defaultAndroidInput.lookUpPointerIndex(pointerId2);
                                if (iLookUpPointerIndex2 == -1) {
                                    i8 = i8;
                                } else if (iLookUpPointerIndex2 < i5) {
                                    int i9 = defaultAndroidInput.button[iLookUpPointerIndex2];
                                    if (i9 != -1) {
                                        i3 = y3;
                                        i4 = x3;
                                        postTouchEvent(defaultAndroidInput, 2, x3, y3, iLookUpPointerIndex2, i9, jNanoTime);
                                    } else {
                                        i3 = y3;
                                        i4 = x3;
                                        postTouchEvent(defaultAndroidInput, 4, i4, i3, iLookUpPointerIndex2, 0, jNanoTime);
                                    }
                                    int[] iArr = defaultAndroidInput.deltaX;
                                    int[] iArr2 = defaultAndroidInput.touchX;
                                    iArr[iLookUpPointerIndex2] = i4 - iArr2[iLookUpPointerIndex2];
                                    int[] iArr3 = defaultAndroidInput.deltaY;
                                    int[] iArr4 = defaultAndroidInput.touchY;
                                    iArr3[iLookUpPointerIndex2] = i3 - iArr4[iLookUpPointerIndex2];
                                    iArr2[iLookUpPointerIndex2] = i4;
                                    iArr4[iLookUpPointerIndex2] = i3;
                                    defaultAndroidInput.pressure[iLookUpPointerIndex2] = motionEvent.getPressure(i8);
                                }
                                i8++;
                                i5 = 20;
                                break;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            Gdx.app.getGraphics().requestRendering();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean supportsMultitouch(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch");
    }
}
