//DO NOT EDIT MANUALLY, let automation work hard.

// auto-generated by PinoutLogic.java based on config/boards/hellen/alphax-4K-GDI/connectors/gdi-A.yaml
// auto-generated by PinoutLogic.java based on config/boards/hellen/alphax-4K-GDI/connectors/gdi-B.yaml
#include "pch.h"

// see comments at declaration in pin_repository.h
const char * getBoardSpecificPinName(brain_pin_e brainPin) {
	switch(brainPin) {
		case Gpio::A9: return "2B Port injector 3";
		case Gpio::C13: return "14A Ignition 1";
		case Gpio::D2: return "5B Main Relay Control";
		case Gpio::D3: return "1B Port injector 4";
		case Gpio::E3: return "11A Ignition 4";
		case Gpio::E4: return "12A Ignition 3";
		case Gpio::E5: return "13A Ignition 2";
		case Gpio::G11: return "7B Fuel Pump";
		case Gpio::G14: return "3B Port injector 2";
		case Gpio::G5: return "4B Port injector 1";
		default: return nullptr;
	}
	return nullptr;
}
