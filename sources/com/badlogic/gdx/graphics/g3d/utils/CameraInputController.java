package com.badlogic.gdx.graphics.g3d.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

/* JADX INFO: loaded from: classes.dex */
public class CameraInputController extends GestureDetector {
    public int activateKey;
    protected boolean activatePressed;
    public boolean alwaysScroll;
    public boolean autoUpdate;
    public int backwardKey;
    protected boolean backwardPressed;
    protected int button;
    public Camera camera;
    protected boolean controlsInverted;
    public int forwardButton;
    public int forwardKey;
    protected boolean forwardPressed;
    public boolean forwardTarget;
    protected final CameraGestureListener gestureListener;
    private boolean multiTouch;
    public float pinchZoomFactor;
    public float rotateAngle;
    public int rotateButton;
    public int rotateLeftKey;
    protected boolean rotateLeftPressed;
    public int rotateRightKey;
    protected boolean rotateRightPressed;
    public float scrollFactor;
    public boolean scrollTarget;
    private float startX;
    private float startY;
    public Vector3 target;
    private final Vector3 tmpV1;
    private final Vector3 tmpV2;
    private int touched;
    public int translateButton;
    public boolean translateTarget;
    public float translateUnits;

    public static class CameraGestureListener extends GestureDetector.GestureAdapter {
        public CameraInputController controller;
        private float previousZoom;

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean fling(float f, float f2, int i) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean longPress(float f, float f2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pan(float f, float f2, float f3, float f4) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean pinch(Vector2 vector2, Vector2 vector3, Vector2 vector4, Vector2 vector5) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean tap(float f, float f2, int i, int i2) {
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean touchDown(float f, float f2, int i, int i2) {
            this.previousZoom = 0.0f;
            return false;
        }

        @Override // com.badlogic.gdx.input.GestureDetector.GestureAdapter, com.badlogic.gdx.input.GestureDetector.GestureListener
        public boolean zoom(float f, float f2) {
            float f3 = f2 - f;
            float f4 = f3 - this.previousZoom;
            this.previousZoom = f3;
            float width = Gdx.graphics.getWidth();
            float height = Gdx.graphics.getHeight();
            CameraInputController cameraInputController = this.controller;
            if (width > height) {
                width = height;
            }
            return cameraInputController.pinchZoom(f4 / width);
        }
    }

    public CameraInputController(CameraGestureListener cameraGestureListener, Camera camera) {
        super(cameraGestureListener);
        this.rotateButton = 0;
        this.rotateAngle = 360.0f;
        this.translateButton = 1;
        this.translateUnits = 10.0f;
        this.forwardButton = 2;
        this.activateKey = 0;
        this.alwaysScroll = true;
        this.scrollFactor = -0.1f;
        this.pinchZoomFactor = 10.0f;
        this.autoUpdate = true;
        this.target = new Vector3();
        this.translateTarget = true;
        this.forwardTarget = true;
        this.scrollTarget = false;
        this.forwardKey = 51;
        this.backwardKey = 47;
        this.rotateRightKey = 29;
        this.rotateLeftKey = 32;
        this.button = -1;
        this.tmpV1 = new Vector3();
        this.tmpV2 = new Vector3();
        this.gestureListener = cameraGestureListener;
        cameraGestureListener.controller = this;
        this.camera = camera;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyDown(int i) {
        if (i == this.activateKey) {
            this.activatePressed = true;
        }
        if (i == this.forwardKey) {
            this.forwardPressed = true;
            return false;
        }
        if (i == this.backwardKey) {
            this.backwardPressed = true;
            return false;
        }
        if (i == this.rotateRightKey) {
            this.rotateRightPressed = true;
            return false;
        }
        if (i != this.rotateLeftKey) {
            return false;
        }
        this.rotateLeftPressed = true;
        return false;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean keyUp(int i) {
        if (i == this.activateKey) {
            this.activatePressed = false;
            this.button = -1;
        }
        if (i == this.forwardKey) {
            this.forwardPressed = false;
        } else if (i == this.backwardKey) {
            this.backwardPressed = false;
        } else if (i == this.rotateRightKey) {
            this.rotateRightPressed = false;
        } else if (i == this.rotateLeftKey) {
            this.rotateLeftPressed = false;
        }
        return false;
    }

    public boolean pinchZoom(float f) {
        return zoom(this.pinchZoomFactor * f);
    }

    public boolean process(float f, float f2, int i) {
        if (i == this.rotateButton) {
            this.tmpV1.set(this.camera.direction).crs(this.camera.up).y = 0.0f;
            this.camera.rotateAround(this.target, this.tmpV1.nor(), f2 * this.rotateAngle);
            this.camera.rotateAround(this.target, Vector3.Y, f * (-this.rotateAngle));
        } else if (i == this.translateButton) {
            Camera camera = this.camera;
            camera.translate(this.tmpV1.set(camera.direction).crs(this.camera.up).nor().scl((-f) * this.translateUnits));
            Camera camera2 = this.camera;
            camera2.translate(this.tmpV2.set(camera2.up).scl((-f2) * this.translateUnits));
            if (this.translateTarget) {
                this.target.add(this.tmpV1).add(this.tmpV2);
            }
        } else if (i == this.forwardButton) {
            Camera camera3 = this.camera;
            camera3.translate(this.tmpV1.set(camera3.direction).scl(f2 * this.translateUnits));
            if (this.forwardTarget) {
                this.target.add(this.tmpV1);
            }
        }
        if (!this.autoUpdate) {
            return true;
        }
        this.camera.update();
        return true;
    }

    @Override // com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean scrolled(float f, float f2) {
        return zoom(f2 * this.scrollFactor * this.translateUnits);
    }

    public void setInvertedControls(boolean z) {
        if (this.controlsInverted != z) {
            this.rotateAngle = -this.rotateAngle;
        }
        this.controlsInverted = z;
    }

    @Override // com.badlogic.gdx.input.GestureDetector, com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDown(int i, int i2, int i3, int i4) {
        int i5 = this.touched | (1 << i3);
        this.touched = i5;
        boolean z = !MathUtils.isPowerOfTwo(i5);
        this.multiTouch = z;
        if (z) {
            this.button = -1;
        } else if (this.button < 0 && (this.activateKey == 0 || this.activatePressed)) {
            this.startX = i;
            this.startY = i2;
            this.button = i4;
        }
        return super.touchDown(i, i2, i3, i4) || this.activateKey == 0 || this.activatePressed;
    }

    @Override // com.badlogic.gdx.input.GestureDetector, com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int i, int i2, int i3) {
        boolean z = super.touchDragged(i, i2, i3);
        if (z || this.button < 0) {
            return z;
        }
        float f = i;
        float width = (f - this.startX) / Gdx.graphics.getWidth();
        float f2 = i2;
        float height = (this.startY - f2) / Gdx.graphics.getHeight();
        this.startX = f;
        this.startY = f2;
        return process(width, height, this.button);
    }

    @Override // com.badlogic.gdx.input.GestureDetector, com.badlogic.gdx.InputAdapter, com.badlogic.gdx.InputProcessor
    public boolean touchUp(int i, int i2, int i3, int i4) {
        int i5 = this.touched & ((1 << i3) ^ (-1));
        this.touched = i5;
        this.multiTouch = !MathUtils.isPowerOfTwo(i5);
        if (i4 == this.button) {
            this.button = -1;
        }
        return super.touchUp(i, i2, i3, i4) || this.activatePressed;
    }

    public void update() {
        if (this.rotateRightPressed || this.rotateLeftPressed || this.forwardPressed || this.backwardPressed) {
            float deltaTime = Gdx.graphics.getDeltaTime();
            if (this.rotateRightPressed) {
                Camera camera = this.camera;
                camera.rotate(camera.up, (-deltaTime) * this.rotateAngle);
            }
            if (this.rotateLeftPressed) {
                Camera camera2 = this.camera;
                camera2.rotate(camera2.up, this.rotateAngle * deltaTime);
            }
            if (this.forwardPressed) {
                Camera camera3 = this.camera;
                camera3.translate(this.tmpV1.set(camera3.direction).scl(this.translateUnits * deltaTime));
                if (this.forwardTarget) {
                    this.target.add(this.tmpV1);
                }
            }
            if (this.backwardPressed) {
                Camera camera4 = this.camera;
                camera4.translate(this.tmpV1.set(camera4.direction).scl((-deltaTime) * this.translateUnits));
                if (this.forwardTarget) {
                    this.target.add(this.tmpV1);
                }
            }
            if (this.autoUpdate) {
                this.camera.update();
            }
        }
    }

    public boolean zoom(float f) {
        if (!this.alwaysScroll && this.activateKey != 0 && !this.activatePressed) {
            return false;
        }
        Camera camera = this.camera;
        camera.translate(this.tmpV1.set(camera.direction).scl(f));
        if (this.scrollTarget) {
            this.target.add(this.tmpV1);
        }
        if (!this.autoUpdate) {
            return true;
        }
        this.camera.update();
        return true;
    }

    public CameraInputController(Camera camera) {
        this(new CameraGestureListener(), camera);
    }
}
