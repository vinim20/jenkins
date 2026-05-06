## Travel_Blog_Application

A modern, full-stack travel blogging platform where users can share their global adventures, discover new destinations, and manage their personal travel journals. Built with a robust Node.js + Express backend and a responsive, high-performance HTML/CSS/JS frontend. This project integrates a modular monolithic architecture and secure authentication.

## Features

🌍 Interactive Blog Feed: Explore travel stories from around the world.
🔐 Secure Authentication: JWT-based user sessions and bcrypt password encryption.
📸 Media Rich Posts: Support for destination images and immersive storytelling.
🔍 Smart Filter: Real-time search by location, category (e.g., 'Adventure', 'Beach'), or date.
📱 Responsive Design: Fully optimized for mobile, tablet, and desktop viewing.
🛠️ CI/CD Ready: Configured for automated deployment pipelines via Jenkins.

## Prerequisites

Before running the project, ensure you have the following installed:

*Node.js (v18 or above)
*Git (for version control)
*A Modern Browser (Chrome, Firefox, or Edge)
*VS Code (Recommended editor)

## Getting Started

Follow these steps to set up and run the project on your local machine:

## 1. Clone the Repository
'''Bash
git clone https://github.com/vinim20/Travel_Blog_Application.git
cd Travel_Blog_Application
'''

## 2. Install Backend Dependencies
'''Bash
cd backend
npm install
'''

## 3. Configure Environment

Create a .env file in the backend folder and add your secrets:

*Plaintext
*PORT=5000
*JWT_SECRET=your_super_secret_key

## 4. Run the Server
'''Bash
node server.js
'''

# Server will start at: http://localhost:5000

##5. Launch the Frontend

Navigate to the frontend directory and open index.html or use the Live Server extension in VS Code:

'''Bash
# Using Live Server is recommended to avoid CORS issues during development
'''

## Project Structure

Plaintext
travel-blog-app/
│
├── backend/
│   ├── server.js          # Main entry point
│   ├── middleware/        # JWT & Auth logic
│   └── routes/            # API endpoints (Auth, Blogs)
│
├── frontend/
│   ├── index.html         # Main blog feed
│   ├── login.html         # User access
│   ├── create-post.html   # Blog editor
│   ├── assets/            # Images and icons
│   └── css/
│       └── style.css      # Custom "Smartboard" styling
│
└── jenkins/
    └── Jenkinsfile        # Pipeline automation script

## Dependencies

Backend
*express — Web framework for Node.js
*cors — Cross-Origin Resource Sharing support
*jsonwebtoken — Secure token-based authentication
*bcryptjs — Industry-standard password hashing
*dotenv — Environment variable management

Frontend
*Vanilla JavaScript — ES6+ for dynamic DOM manipulation
*FontAwesome — High-quality vector icons
*Google Fonts — Inter & Montserrat typography
*Automation & CI/CD
This project is designed to be built and tested automatically.

## CI Tool: Jenkins

Deployment: Integrated with Vercel/Render for live hosting.

Workflow: Code Push → Jenkins Build → Automated Test → Production Deploy.

## Contributing

*Fork the repository.
*Create a feature branch (git checkout -b feature/NewFeature).
*Commit your changes (git commit -m 'Add some NewFeature').
*Push to the branch (git push origin feature/NewFeature).
*Open a Pull Request.

## License

This project is licensed under the MIT License.

## Acknowledgements

*Infosys Springboard - For Agile & DevOps certification training.
*Node.js Community - For the robust backend ecosystem.
*Open Source - All the contributors whose tools made this possible.

