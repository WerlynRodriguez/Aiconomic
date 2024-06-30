## Run Cloud Functions locally

**Required Versions:**
- Node: v22.3.0
- Python: 3.12.3

**To run Cloud Functions locally, follow these steps:**
1. Inside [/firebase-functions/functions](/firebase-functions/functions) directory run the commands below
2. Install the Firebase CLI by running the following command: `npm install -g firebase-tools`
3. Create a Python virtual environment by executing the command: `python3 -m venv venv`
4. Activate the virtual environment and install the required dependencies by running: `source venv/bin/activate && python3 -m pip install -r requirements.txt`
5. Start the emulator by running: `firebase emulators:start`
