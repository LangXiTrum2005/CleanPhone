package com.badlogic.gdx;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.SnapshotArray;

/* JADX INFO: loaded from: classes.dex */
public class InputMultiplexer implements InputProcessor {
    private SnapshotArray<InputProcessor> processors;

    public InputMultiplexer() {
        this.processors = new SnapshotArray<>(4);
    }

    public void addProcessor(int i, InputProcessor inputProcessor) {
        if (inputProcessor == null) {
            throw new NullPointerException("processor cannot be null");
        }
        this.processors.insert(i, inputProcessor);
    }

    public void clear() {
        this.processors.clear();
    }

    public SnapshotArray<InputProcessor> getProcessors() {
        return this.processors;
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyDown(int i) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i2 = this.processors.size;
            for (int i3 = 0; i3 < i2; i3++) {
                if (inputProcessorArrBegin[i3].keyDown(i)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyTyped(char c) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i = this.processors.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (inputProcessorArrBegin[i2].keyTyped(c)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean keyUp(int i) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i2 = this.processors.size;
            for (int i3 = 0; i3 < i2; i3++) {
                if (inputProcessorArrBegin[i3].keyUp(i)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean mouseMoved(int i, int i2) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i3 = this.processors.size;
            for (int i4 = 0; i4 < i3; i4++) {
                if (inputProcessorArrBegin[i4].mouseMoved(i, i2)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    public void removeProcessor(int i) {
        this.processors.removeIndex(i);
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean scrolled(float f, float f2) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i = this.processors.size;
            for (int i2 = 0; i2 < i; i2++) {
                if (inputProcessorArrBegin[i2].scrolled(f, f2)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    public void setProcessors(InputProcessor... inputProcessorArr) {
        this.processors.clear();
        this.processors.addAll(inputProcessorArr);
    }

    public int size() {
        return this.processors.size;
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchCancelled(int i, int i2, int i3, int i4) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i5 = this.processors.size;
            for (int i6 = 0; i6 < i5; i6++) {
                if (inputProcessorArrBegin[i6].touchCancelled(i, i2, i3, i4)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDown(int i, int i2, int i3, int i4) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i5 = this.processors.size;
            for (int i6 = 0; i6 < i5; i6++) {
                if (inputProcessorArrBegin[i6].touchDown(i, i2, i3, i4)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchDragged(int i, int i2, int i3) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i4 = this.processors.size;
            for (int i5 = 0; i5 < i4; i5++) {
                if (inputProcessorArrBegin[i5].touchDragged(i, i2, i3)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    @Override // com.badlogic.gdx.InputProcessor
    public boolean touchUp(int i, int i2, int i3, int i4) {
        InputProcessor[] inputProcessorArrBegin = this.processors.begin();
        try {
            int i5 = this.processors.size;
            for (int i6 = 0; i6 < i5; i6++) {
                if (inputProcessorArrBegin[i6].touchUp(i, i2, i3, i4)) {
                    return true;
                }
            }
            return false;
        } finally {
            this.processors.end();
        }
    }

    public void removeProcessor(InputProcessor inputProcessor) {
        this.processors.removeValue(inputProcessor, true);
    }

    public InputMultiplexer(InputProcessor... inputProcessorArr) {
        SnapshotArray<InputProcessor> snapshotArray = new SnapshotArray<>(4);
        this.processors = snapshotArray;
        snapshotArray.addAll(inputProcessorArr);
    }

    public void addProcessor(InputProcessor inputProcessor) {
        if (inputProcessor != null) {
            this.processors.add(inputProcessor);
            return;
        }
        throw new NullPointerException("processor cannot be null");
    }

    public void setProcessors(Array<InputProcessor> array) {
        this.processors.clear();
        this.processors.addAll(array);
    }
}
