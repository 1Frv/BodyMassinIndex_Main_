package mono.android.app;

public class ApplicationRegistration {

	public static void registerApplications ()
	{
				// Application and Instrumentation ACWs must be registered first.
		mono.android.Runtime.register ("BodyMassIndex.GUI.MainApplication, BodyMassIndex.GUI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc64f9b3adc9c35b5063.MainApplication.class, crc64f9b3adc9c35b5063.MainApplication.__md_methods);
		mono.android.Runtime.register ("Microsoft.Maui.MauiApplication, Microsoft.Maui, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", crc6488302ad6e9e4df1a.MauiApplication.class, crc6488302ad6e9e4df1a.MauiApplication.__md_methods);
		
	}
}
