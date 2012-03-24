package mobile.homework;

import android.app.Activity;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.view.View;

public class flashtest extends Activity
{

public void lightOn(View v)
{
	Camera camera = Camera.open();
	Parameters p = camera.getParameters();
	p.setFlashMode(Parameters.FLASH_MODE_TORCH);
	camera.setParameters(p);
	camera.startPreview();
}

public void lightOff(View v)
{
	Camera camera = Camera.open();
	Parameters p = camera.getParameters();
	p.setFlashMode(Parameters.FLASH_MODE_OFF);
	camera.setParameters(p);
	camera.stopPreview();
}
}