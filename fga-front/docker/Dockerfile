FROM node:20-alpine

WORKDIR /app

# Copy package.json and package-lock.json (if available)
COPY my-app/package.json my-app/package-lock.json* ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY my-app/ .

# Expose the port Vite runs on
EXPOSE 5173

# Command to run the application
CMD ["npm", "run", "dev", "--", "--host"]
